package johny.costsaccounter.Model.Interfaces;

/**
 * Created by Johny on 21.06.2017.
 */
public interface Saveable {
    void save(String filePath);
    void load(String filePath);
}
