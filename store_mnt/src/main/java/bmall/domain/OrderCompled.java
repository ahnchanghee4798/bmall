package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCompled extends AbstractEvent {

    private Long id;

    public OrderCompled(OrderDb aggregate){
        super(aggregate);
    }
    public OrderCompled(){
        super();
    }
}
