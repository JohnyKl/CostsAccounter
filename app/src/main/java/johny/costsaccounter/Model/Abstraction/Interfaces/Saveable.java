package johny.costsaccounter.Model.Abstraction.Interfaces;

/**
 * Created by Johny on 21.06.2017.
 */
public interface Saveable {
    void saveBinary(String filePath);
    void loadBinary(String filePath);

    void saveTextFormatted(String filePath);
}
