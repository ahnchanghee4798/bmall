package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCenceled extends AbstractEvent {

    private Long id;

    public OrderCenceled(OrderDb aggregate){
        super(aggregate);
    }
    public OrderCenceled(){
        super();
    }
}
