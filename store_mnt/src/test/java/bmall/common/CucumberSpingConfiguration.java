package bmall.common;


import bmall.StoreMntApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StoreMntApplication.class })
public class CucumberSpingConfiguration {
    
}
