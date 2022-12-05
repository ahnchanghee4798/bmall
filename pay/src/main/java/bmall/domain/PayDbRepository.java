package bmall.domain;

import bmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="payDbs", path="payDbs")
public interface PayDbRepository extends PagingAndSortingRepository<PayDb, Long>{

}
