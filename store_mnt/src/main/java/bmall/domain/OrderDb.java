package bmall.domain;

import bmall.domain.OrderCompled;
import bmall.domain.OrderCenceled;
import bmall.StoreMntApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderDb_table")
@Data

public class OrderDb  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){


        OrderCompled orderCompled = new OrderCompled(this);
        orderCompled.publishAfterCommit();



        OrderCenceled orderCenceled = new OrderCenceled(this);
        orderCenceled.publishAfterCommit();

    }

    public static OrderDbRepository repository(){
        OrderDbRepository orderDbRepository = StoreMntApplication.applicationContext.getBean(OrderDbRepository.class);
        return orderDbRepository;
    }




    public static void orderInfo(PayOk payOk){

        /** Example 1:  new item 
        OrderDb orderDb = new OrderDb();
        repository().save(orderDb);

        */

        /** Example 2:  finding and process
        
        repository().findById(payOk.get???()).ifPresent(orderDb->{
            
            orderDb // do something
            repository().save(orderDb);


         });
        */

        
    }


}
