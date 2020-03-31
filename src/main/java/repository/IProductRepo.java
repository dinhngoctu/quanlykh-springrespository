package repository;

import model.Product;
import model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepo extends PagingAndSortingRepository<Product, Long> {
    Iterable<Product> findAllByProvince(Province province);
}
