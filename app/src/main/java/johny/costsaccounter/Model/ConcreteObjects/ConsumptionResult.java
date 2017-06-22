package johny.costsaccounter.Model.ConcreteObjects;

import java.lang.reflect.InvocationTargetException;

import johny.costsaccounter.Model.Abstraction.HumanActionResult;
import johny.costsaccounter.Model.Factories.HumanActionResultFabric;

/**
 * Created by Johny on 22.06.2017.
 */

public class ConsumptionResult extends HumanActionResult<Double> {

    public ConsumptionResult() {
        this(0.0);
    }

    public ConsumptionResult(Double value) {
        super();
        setValue(value);
    }
    @Override
    public String toString() {
        return String.format(" - %1$3.2f ₴",getValue());
    }

    @Override
    public HumanActionResult clone() {
        try {
            return HumanActionResultFabric.createInstance(ConsumptionResult.class, getValue());
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: need to add logging
        }

        return null;
    }

    @Override
    public void add(Double otherResult) {

    }

}
