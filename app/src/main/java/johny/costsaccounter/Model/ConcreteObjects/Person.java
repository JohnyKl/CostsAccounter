package johny.costsaccounter.Model.ConcreteObjects;

import java.util.ArrayList;
import java.util.Date;

import johny.costsaccounter.Model.Abstraction.Human;
import johny.costsaccounter.Model.Abstraction.HumanActionsList;
import johny.costsaccounter.Model.Factories.HumanActionListFactory;

/**
 * Created by Johny on 21.06.2017.
 */
public class Person extends Human {
    public Person() throws IllegalAccessException, InstantiationException {
        this(defaultName);
    }

    public Person(String name) throws IllegalAccessException, InstantiationException {
        super(name);
    }

    @Override
    public String toString() {
        return name + getTotalResult().toString();
    }

    @Override
    protected void setOccuredActions(HumanActionsList occuredActions) throws IllegalAccessException, InstantiationException {
        if (occuredActions != null) {
            this.occuredActions = occuredActions;
        } else
            this.occuredActions = HumanActionListFactory.createInstance(PersonalActionList.class);
    }
}
