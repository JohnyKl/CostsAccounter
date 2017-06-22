package johny.costsaccounter.Model.Factories;

import android.support.annotation.NonNull;

import java.lang.reflect.InvocationTargetException;

import johny.costsaccounter.Model.Abstraction.Human;

/**
 * Created by Johny on 22.06.2017.
 */

public class HumanFactory {
    public static <T extends Human> T createInstance(Class<T> instanceClass, String name) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return instanceClass.getConstructor(String.class).newInstance(name);
    }
}