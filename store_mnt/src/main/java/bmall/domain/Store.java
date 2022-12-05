package bmall.domain;

import bmall.domain.OrderCompled;
import bmall.domain.OrderCenceled;
import bmall.StoreMntApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Store_table")
@Data

public class Store  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String storeOrderid;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        OrderCompled orderCompled = new OrderCompled(this);
        orderCompled.publishAfterCommit();



        OrderCenceled orderCenceled = new OrderCenceled(this);
        orderCenceled.publishAfterCommit();

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreMntApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }




    public static void orderReceive(PayOk payOk){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(payOk.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }


}
