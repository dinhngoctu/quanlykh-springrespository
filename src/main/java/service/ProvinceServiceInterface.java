package service;

import model.Province;

import java.util.List;

public interface ProvinceServiceInterface {
    List<Province> findAll();

    void save(Province province);

    void remove(String name);

    Province findByName(String name);
}
