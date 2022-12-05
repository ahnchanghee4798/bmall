package bmall.domain;

import bmall.domain.Thank;
import bmall.CustumerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Customer_table")
@Data

public class Customer  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        Thank thank = new Thank(this);
        thank.publishAfterCommit();

    }

    public static CustomerRepository repository(){
        CustomerRepository customerRepository = CustumerApplication.applicationContext.getBean(CustomerRepository.class);
        return customerRepository;
    }




    public static void thankToCustomer(OrderCompled orderCompled){

        /** Example 1:  new item 
        Customer customer = new Customer();
        repository().save(customer);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCompled.get???()).ifPresent(customer->{
            
            customer // do something
            repository().save(customer);


         });
        */

        
    }


}
