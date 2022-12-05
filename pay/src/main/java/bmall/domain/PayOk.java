package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PayOk extends AbstractEvent {

    private Long id;

    public PayOk(PayDb aggregate){
        super(aggregate);
    }
    public PayOk(){
        super();
    }
}
