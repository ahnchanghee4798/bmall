package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCenceled extends AbstractEvent {

    private Long id;
    private String orderid;
    private String pay;

    public OrderCenceled(Order aggregate){
        super(aggregate);
    }
    public OrderCenceled(){
        super();
    }
}
