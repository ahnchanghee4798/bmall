package bmall.domain;

import bmall.domain.DeliveryStarted;
import bmall.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Delvery_table")
@Data

public class Delvery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();

    }

    public static DelveryRepository repository(){
        DelveryRepository delveryRepository = DeliveryApplication.applicationContext.getBean(DelveryRepository.class);
        return delveryRepository;
    }






}
