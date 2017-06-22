package johny.costsaccounter.Model.ConcreteObjects;

import java.lang.reflect.InvocationTargetException;
import johny.costsaccounter.Model.Abstraction.HumansList;
import johny.costsaccounter.Model.Factories.HumanFactory;

/**
 * Created by Johny on 21.06.2017.
 */
public class PersonsList extends HumansList {

    @Override
    public void addHuman(String humanName) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Person p = HumanFactory.createInstance(Person.class, humanName);
        addHuman(p);
    }

    @Override
    public void saveTextFormatted(String filePath) {
    //todo: add saving to the file in a good  readable text format
    }
}
