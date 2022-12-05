package bmall.infra;
import bmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderDbHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderDb>>  {

    @Override
    public EntityModel<OrderDb> process(EntityModel<OrderDb> model) {

        
        return model;
    }
    
}
