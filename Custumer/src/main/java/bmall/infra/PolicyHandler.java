package bmall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import bmall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import bmall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired CustomerRepository customerRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCompled'")
    public void wheneverOrderCompled_ThankToCustomer(@Payload OrderCompled orderCompled){

        OrderCompled event = orderCompled;
        System.out.println("\n\n##### listener ThankToCustomer : " + orderCompled + "\n\n");


        

        // Sample Logic //
        Customer.thankToCustomer(event);
        

        

    }

}


