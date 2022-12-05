package bmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderSt_table")
@Data
public class OrderSt {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
