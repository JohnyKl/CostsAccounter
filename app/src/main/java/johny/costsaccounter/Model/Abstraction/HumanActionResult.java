package johny.costsaccounter.Model.Abstraction;

import java.io.Serializable;

/**
 * Created by Johny on 22.06.2017.
 */

public abstract class HumanActionResult<T> implements Serializable {
    @Override
    public abstract String toString();

    @Override
    public abstract HumanActionResult clone();

    public abstract void add(T otherResult);

    public T getValue() {
        return value;
    }

    protected void setValue(T result) {
        this.value = result;
    }

    private T value;
}
