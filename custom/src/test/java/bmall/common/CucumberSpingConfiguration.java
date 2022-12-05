package bmall.common;


import bmall.CustomApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomApplication.class })
public class CucumberSpingConfiguration {
    
}
