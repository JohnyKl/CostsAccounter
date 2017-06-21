package johny.costsaccounter.Controllers;

import johny.costsaccounter.Controllers.FileIOControllers.FileIOController;

/**
 * Created by Johny on 21.06.2017.
 */
public class PersonListController {
    private FileIOController fileIOController;
    private int currentMonth = 1;

    public PersonListController() {

    }

    public PersonListController(FileIOController controller){
        fileIOController = controller;
    }
}
