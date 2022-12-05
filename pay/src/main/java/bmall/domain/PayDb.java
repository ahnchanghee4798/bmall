package bmall.domain;

import bmall.domain.PayOk;
import bmall.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="PayDb_table")
@Data

public class PayDb  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        PayOk payOk = new PayOk(this);
        payOk.publishAfterCommit();

    }

    public static PayDbRepository repository(){
        PayDbRepository payDbRepository = PayApplication.applicationContext.getBean(PayDbRepository.class);
        return payDbRepository;
    }




    public static void payNa(OrderCencel orderCencel){

        /** Example 1:  new item 
        PayDb payDb = new PayDb();
        repository().save(payDb);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCencel.get???()).ifPresent(payDb->{
            
            payDb // do something
            repository().save(payDb);


         });
        */

        
    }


}
