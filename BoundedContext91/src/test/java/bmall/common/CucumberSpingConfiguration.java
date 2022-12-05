package bmall.common;


import bmall.BoundedContext91Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext91Application.class })
public class CucumberSpingConfiguration {
    
}
