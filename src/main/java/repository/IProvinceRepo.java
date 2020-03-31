package repository;
import model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface IProvinceRepo extends PagingAndSortingRepository<Province, String> {
}
