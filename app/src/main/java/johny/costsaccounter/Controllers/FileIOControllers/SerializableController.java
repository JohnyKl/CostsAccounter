package johny.costsaccounter.Controllers.FileIOControllers;

import johny.costsaccounter.Model.Abstraction.Interfaces.Saveable;

/**
 * Created by Johny on 21.06.2017.
 */
public class SerializableController implements FileIOController {
    @Override
    public void Save(String filePath, Saveable objToSave) {

    }

    @Override
    public Saveable Load(String filePath) {
        return null;
    }
}
