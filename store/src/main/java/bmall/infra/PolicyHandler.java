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
    @Autowired OrderDbRepository orderDbRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PayOk'")
    public void wheneverPayOk_OrderInfo(@Payload PayOk payOk){

        PayOk event = payOk;
        System.out.println("\n\n##### listener OrderInfo : " + payOk + "\n\n");


        

        // Sample Logic //
        OrderDb.orderInfo(event);
        

        

    }

}


