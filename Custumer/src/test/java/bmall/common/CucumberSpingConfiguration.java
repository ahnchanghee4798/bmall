package bmall.common;


import bmall.CustumerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustumerApplication.class })
public class CucumberSpingConfiguration {
    
}
