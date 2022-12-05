package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderOk extends AbstractEvent {

    private Long id;

    public OrderOk(Order aggregate){
        super(aggregate);
    }
    public OrderOk(){
        super();
    }
}
