package johny.costsaccounter.Controllers.FileIOControllers;
import johny.costsaccounter.Model.Interfaces.Saveable;

/**
 * Created by Johny on 21.06.2017.
 */
public interface FileIOController {
    void Save(String filePath, Saveable objToSave);
    Saveable Load(String filePath);
}
