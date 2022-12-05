package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DelyOk extends AbstractEvent {

    private Long id;

    public DelyOk(OrderDb aggregate){
        super(aggregate);
    }
    public DelyOk(){
        super();
    }
}
