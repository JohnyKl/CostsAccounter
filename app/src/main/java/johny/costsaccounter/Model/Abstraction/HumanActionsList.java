package johny.costsaccounter.Model.Abstraction;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johny on 22.06.2017.
 */

public abstract class HumanActionsList implements Serializable {
    public HumanActionsList() {
        setUp();
    }

    public HumanActionsList(int size) {
        setUp(size);
    }

    public HumanActionsList(List<HumanAction> occuredActions) {
        setOccuredActions(occuredActions);
    }

    public void setUp() {
        setUp(defaultListSize);
    }

    public void setUp(int size) {
        occuredActions = new ArrayList<>(size);
    }

    public List<HumanAction> getOccuredActions() {
        return occuredActions;
    }

    public void setOccuredActions(List<HumanAction> occuredActions) {
        if (occuredActions != null) {
            this.occuredActions = occuredActions;
        } else {
            setUp();
        }
    }

    public void addHumanAction(HumanAction action) {
        if (action == null) {
            //TODO: need to add a logging
            return;
        }
        if (occuredActions != null)
            occuredActions.add(action);
    }

    public void removeHumanAction(int index) {
        if (occuredActions != null && index < occuredActions.size()) {
            occuredActions.remove(index);
        }
    }

    public void removeHumanAction(HumanAction action) {
        if (occuredActions != null && action != null) {
            occuredActions.remove(action);
        }
    }

    public HumanActionResult getTotalResult() {
        HumanActionResult totalResult = null;
        if (occuredActions != null && occuredActions.size() > 0) {
            totalResult = occuredActions.get(0).getResult().clone();
        }

        if (totalResult != null) {
            for (HumanAction action :
                    occuredActions) {
                totalResult.add(action.getResult().getValue());
            }
        }

        return totalResult;
    }

    private List<HumanAction> occuredActions;

    private static final int defaultListSize = 4;
}
