package johny.costsaccounter.Model.Abstraction;

import java.io.Serializable;

/**
 * Created by Johny on 22.06.2017.
 */

public abstract class Human implements Serializable {
    public Human() throws InstantiationException, IllegalAccessException {
        this(null);
    }

    public Human(String name) throws IllegalAccessException, InstantiationException {
        this(name, null);
    }

    public Human(String name, HumanActionsList occuredActions) throws InstantiationException, IllegalAccessException {
        autoSetId();
        setName(name);
        setOccuredActions(occuredActions);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        name = name.trim();

        if (name != null && !name.isEmpty())
            this.name = name;
        else
            this.name = String.format(defaultName, id);
    }

    public HumanActionsList getOccuredActions() {
        return occuredActions;
    }

    public void addHumanAction(HumanAction action) {
        if (occuredActions != null) {
            occuredActions.addHumanAction(action);
        }
    }

    public void removeHumanAction(HumanAction action) {
        if (occuredActions != null) {
            occuredActions.removeHumanAction(action);
        }
    }

    public void removeHumanAction(int actionIndex) {
        if (occuredActions != null) {
            occuredActions.removeHumanAction(actionIndex);
        }
    }

    public HumanActionResult getTotalResult() {
        if (occuredActions != null) {
            return occuredActions.getTotalResult();
        } else {
            return null;
        }
    }

    @Override
    public abstract String toString();

    protected abstract void setOccuredActions(HumanActionsList occuredActions) throws IllegalAccessException, InstantiationException;

    private void autoSetId() {
        IdCounter++;
        this.id = IdCounter;
    }

    protected int id;
    protected String name;
    protected HumanActionsList occuredActions;
    protected static String defaultName = "Human ";

    private static int IdCounter = 0;
}
