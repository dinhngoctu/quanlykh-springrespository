package service;


import model.Product;
import model.Province;

import java.util.List;

public interface ProductServiceInterFace {

    List<Product> findAll();

    List<Product> findAllByProvince(Province province);

    Product findById(Long id);

    void revmove(Long id);

    void save(Product product);
}
