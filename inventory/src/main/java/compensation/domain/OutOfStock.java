package compensation.domain;

import compensation.domain.*;
import compensation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;
    private String stock;
    private String orderId;

    public OutOfStock(Inventory aggregate) {
        super(aggregate);
    }

    public OutOfStock() {
        super();
    }
}
//>>> DDD / Domain Event
