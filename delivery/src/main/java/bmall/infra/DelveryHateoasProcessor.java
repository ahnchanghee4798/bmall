package bmall.infra;
import bmall.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DelveryHateoasProcessor implements RepresentationModelProcessor<EntityModel<Delvery>>  {

    @Override
    public EntityModel<Delvery> process(EntityModel<Delvery> model) {

        
        return model;
    }
    
}
