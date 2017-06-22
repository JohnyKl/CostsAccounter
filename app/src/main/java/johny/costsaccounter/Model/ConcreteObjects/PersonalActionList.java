package johny.costsaccounter.Model.ConcreteObjects;

import java.util.List;

import johny.costsaccounter.Model.Abstraction.HumanAction;
import johny.costsaccounter.Model.Abstraction.HumanActionsList;

/**
 * Created by Johny on 22.06.2017.
 */

public class PersonalActionList extends HumanActionsList {
    public PersonalActionList() {
        super();
    }

    public PersonalActionList(int size) {
        super(size);
    }

    public PersonalActionList(List<HumanAction> occuredActions) {
        super(occuredActions);
    }
}
