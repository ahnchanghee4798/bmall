package bmall.common;


import bmall.KakaoApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { KakaoApplication.class })
public class CucumberSpingConfiguration {
    
}
