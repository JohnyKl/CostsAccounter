package johny.costsaccounter.Model.Factories;

import java.lang.reflect.InvocationTargetException;

import johny.costsaccounter.Model.Abstraction.HumanAction;

/**
 * Created by Johny on 22.06.2017.
 */

public class HumanActionFactory {
    public static <T extends HumanAction> T createInstance(Class<T> instanceClass) throws InstantiationException, IllegalAccessException {
        return instanceClass.newInstance();
    }

    public static <T extends HumanAction> T createInstance(Class<T> instanceClass, double value) throws InstantiationException, IllegalAccessException ,NoSuchMethodException, InvocationTargetException {
        return instanceClass.getConstructor(double.class).newInstance(value);
    }
}
