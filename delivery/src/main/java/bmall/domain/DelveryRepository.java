package bmall.domain;

import bmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="delveries", path="delveries")
public interface DelveryRepository extends PagingAndSortingRepository<Delvery, Long>{

}
