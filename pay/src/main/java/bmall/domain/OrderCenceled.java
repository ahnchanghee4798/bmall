package bmall.domain;

import bmall.domain.*;
import bmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCenceled extends AbstractEvent {

    private Long id;
    private String orderid;
    private String pay;
}


