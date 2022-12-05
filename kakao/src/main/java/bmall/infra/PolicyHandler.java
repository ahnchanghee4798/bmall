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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCompled'")
    public void wheneverOrderCompled_KakaoAlram(@Payload OrderCompled orderCompled){

        OrderCompled event = orderCompled;
        System.out.println("\n\n##### listener KakaoAlram : " + orderCompled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_KakaoAlram(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener KakaoAlram : " + deliveryStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCompled'")
    public void wheneverOrderCompled_KakaoAlram(@Payload OrderCompled orderCompled){

        OrderCompled event = orderCompled;
        System.out.println("\n\n##### listener KakaoAlram : " + orderCompled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCenceled'")
    public void wheneverOrderCenceled_KakaoAlram(@Payload OrderCenceled orderCenceled){

        OrderCenceled event = orderCenceled;
        System.out.println("\n\n##### listener KakaoAlram : " + orderCenceled + "\n\n");


        

        // Sample Logic //

        

    }

}


