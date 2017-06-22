package johny.costsaccounter.Model.Abstraction;

import java.io.Serializable;

/**
 * Created by Johny on 22.06.2017.
 */

public abstract class HumanAction implements Serializable {
    public HumanAction() {
        setResult(null);
    }

    public HumanActionResult getResult() {
        return result;
    }

    protected abstract void setResult(HumanActionResult result);
    private HumanActionResult result;
}
