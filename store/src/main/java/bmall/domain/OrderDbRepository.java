package bmall.domain;

import bmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderDbs", path="orderDbs")
public interface OrderDbRepository extends PagingAndSortingRepository<OrderDb, Long>{

}
