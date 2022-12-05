package bmall.domain;

import bmall.domain.OrderOk;
import bmall.domain.OrderCencel;
import bmall.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        bmall.external.PayDb payDb = new bmall.external.PayDb();
        // mappings goes here
        OrderApplication.applicationContext.getBean(bmall.external.PayDbService.class)
            .pay(payDb);


        OrderOk orderOk = new OrderOk(this);
        orderOk.publishAfterCommit();



        OrderCencel orderCencel = new OrderCencel(this);
        orderCencel.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
