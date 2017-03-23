package be.spf;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "employer", path = "employer")
public interface EmployerRepository extends PagingAndSortingRepository<Employer, Long> {

	List<Employer> findByName(@Param("name") String name);

}
