package bmall.infra;
import bmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PayDbHateoasProcessor implements RepresentationModelProcessor<EntityModel<PayDb>>  {

    @Override
    public EntityModel<PayDb> process(EntityModel<PayDb> model) {

        
        return model;
    }
    
}
