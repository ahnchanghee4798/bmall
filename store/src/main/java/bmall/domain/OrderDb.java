package bmall.domain;

import bmall.domain.DelyOk;
import bmall.StoreApplication;
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

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        bmall.external.Delvery delvery = new bmall.external.Delvery();
        // mappings goes here
        StoreApplication.applicationContext.getBean(bmall.external.DelveryService.class)
            .startDelivery(delvery);


        DelyOk delyOk = new DelyOk(this);
        delyOk.publishAfterCommit();

    }

    public static OrderDbRepository repository(){
        OrderDbRepository orderDbRepository = StoreApplication.applicationContext.getBean(OrderDbRepository.class);
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
