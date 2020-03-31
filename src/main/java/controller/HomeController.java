package controller;

import model.Product;
import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.ProductServiceInterFace;
import service.ProvinceServiceInterface;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
    @Autowired
    ProductServiceInterFace productService;
    @Autowired
    ProvinceServiceInterface provinceService;

    @ModelAttribute("provinces")
    List<Province> provinces() {
        return provinceService.findAll();
    }
    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("products", productService.findAll());
        return "home";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("product", new Product());
        List<Province> provinces = new ArrayList<>();
        provinces.add(new Province("Ha Noi"));
        provinces.add(new Province("Ho Chi Minh"));
        provinces.add(new Province("Da Nang"));
        model.addAttribute("provinces", provinces);
        model.addAttribute("province", new Province());
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(@ModelAttribute("product") Product product,@ModelAttribute("province") Province province, Model model) {
//        if (product != null) {
//            System.out.println(product.getProvince().getName());
        model.addAttribute("message", "thanh cong");
//            productService.save(product);
//            provinceService.save(product.getProvince());
//        }
//        if (province != null) {
            System.out.println(province.getName());
            System.out.println(product.getProvince().getName());
//        }
        return "create";
    }
}
