package johny.costsaccounter.Model.Factories;

import java.lang.reflect.InvocationTargetException;

import johny.costsaccounter.Model.Abstraction.HumanActionResult;

/**
 * Created by Johny on 22.06.2017.
 */

public class HumanActionResultFabric {
    public static <T extends HumanActionResult> T createInstance(Class<T> instanceClass, double value) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return instanceClass.getConstructor(double.class).newInstance(value);
    }
}
