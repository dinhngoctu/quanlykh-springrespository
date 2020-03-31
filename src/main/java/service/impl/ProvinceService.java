package service.impl;

import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IProvinceRepo;
import service.ProvinceServiceInterface;

import java.util.List;

public class ProvinceService implements ProvinceServiceInterface {
    @Autowired
    IProvinceRepo iProvinceRepo;

    @Override
    public List<Province> findAll() {
        return (List<Province>) iProvinceRepo.findAll();
    }

    @Override
    public void save(Province province) {
        iProvinceRepo.save(province);
    }

    @Override
    public void remove(String name) {

    }

    @Override
    public Province findByName(String name) {
        return iProvinceRepo.findById(name).orElse(new Province());
    }

//    @Override
//    public void remove(String name) {
//        iProvinceRepo.delete(name);
//    }
//
//    @Override
//    public Province findByName(String name) {
//        return iProvinceRepo.findById(name);
//    }
}
