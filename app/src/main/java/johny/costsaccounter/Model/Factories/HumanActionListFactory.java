package johny.costsaccounter.Model.Factories;

import java.lang.reflect.InvocationTargetException;

import johny.costsaccounter.Model.Abstraction.HumanActionsList;

/**
 * Created by Johny on 22.06.2017.
 */

public class HumanActionListFactory {
    public static <T extends HumanActionsList> T createInstance(Class<T> instanceClass) throws InstantiationException, IllegalAccessException {
        T list = instanceClass.newInstance();
        return list;
    }

    public static <T extends HumanActionsList> T createInstance(Class<T> instanceClass, int size) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        T list = instanceClass.getConstructor(int.class).newInstance(size);

        return list;
    }
}
