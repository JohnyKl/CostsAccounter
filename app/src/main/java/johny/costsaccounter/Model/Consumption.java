package johny.costsaccounter.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Johny on 21.06.2017.
 */
public class Consumption implements Serializable {
    public Date date;
    public double cost;

    public Consumption() {
        this(new Date(), 0.0);
    }
    public Consumption( double cost) {
        this(new Date(), cost);
    }

    public Consumption( Date date, double cost) {
        this.date = date;
        this.cost = cost;
    }
}
