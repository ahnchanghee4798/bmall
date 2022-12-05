package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCompled extends AbstractEvent {

    private Long id;
    private String orderid;
    private String pay;

    public OrderCompled(Order aggregate){
        super(aggregate);
    }
    public OrderCompled(){
        super();
    }
}
