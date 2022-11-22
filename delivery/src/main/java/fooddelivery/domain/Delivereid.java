package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Delivereid extends AbstractEvent {

    private Long id;
    private String foodid;
    private String preference;
    private String orderid;
    private String sts;

    public Delivereid(Delivery aggregate){
        super(aggregate);
    }
    public Delivereid(){
        super();
    }
}
