package bmall.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "pay", url = "${api.url.pay}")
public interface PayDbService {
    @RequestMapping(method= RequestMethod.POST, path="/payDbs")
    public void pay(@RequestBody PayDb payDb);
}
