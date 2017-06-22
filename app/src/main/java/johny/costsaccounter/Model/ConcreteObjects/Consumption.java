package johny.costsaccounter.Model.ConcreteObjects;

import java.util.Date;

import johny.costsaccounter.Model.Abstraction.HumanAction;
import johny.costsaccounter.Model.Abstraction.HumanActionResult;

/**
 * Created by Johny on 21.06.2017.
 */
public class Consumption extends HumanAction {
    public Date date;
    public double cost;

    public Consumption() {
        this(new Date(), 0.0);
    }

    @Override
    protected void setResult(HumanActionResult result) {
       //todo: realize method
    }

    public Consumption( double cost) {
        this(new Date(), cost);
    }

    public Consumption( Date date, double cost) {
        this.date = date;
        this.cost = cost;
    }
}
