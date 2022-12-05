package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Thank extends AbstractEvent {

    private Long id;

    public Thank(Customer aggregate){
        super(aggregate);
    }
    public Thank(){
        super();
    }
}
