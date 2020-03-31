package service.impl;

import model.Product;
import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IProductRepo;
import service.ProductServiceInterFace;

import java.util.List;

public class ProductService implements ProductServiceInterFace {
    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) iProductRepo.findAll();
    }

    @Override
    public List<Product> findAllByProvince(Province province) {
        return (List<Product>) iProductRepo.findAllByProvince(province);
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void revmove(Long id) {

    }

//    @Override
//    public Product findById(Long id) {
//        return iProductRepo.findOne(id);
//    }

//    @Override
//    public void revmove(Long id) {
//        iProductRepo.delete(id);
//    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }
}
