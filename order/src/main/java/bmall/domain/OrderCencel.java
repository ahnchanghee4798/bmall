package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCencel extends AbstractEvent {

    private Long id;

    public OrderCencel(Order aggregate){
        super(aggregate);
    }
    public OrderCencel(){
        super();
    }
}
