package johny.costsaccounter.Model.Abstraction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import johny.costsaccounter.Model.Abstraction.Interfaces.Saveable;

/**
 * Created by Johny on 22.06.2017.
 */

public abstract class HumansList implements Saveable {

    public final static String FILE_PATH = "humans.sd";
    private ArrayList<Human> humans = new ArrayList<>();

    @Override
    public void saveBinary(String filePath) {
        if (filePath == null || filePath.isEmpty()) filePath = FILE_PATH;

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
            out.writeObject(humans);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();//TODO: need to Add the logger
        }
    }

    @Override
    public void loadBinary(String filePath) {
        if (filePath == null || filePath.isEmpty()) filePath = FILE_PATH;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream oin = new ObjectInputStream(fis);
            humans = (ArrayList<Human>) oin.readObject();
        } catch (IOException e) {
            e.printStackTrace();//TODO: need to Add the logger
        } catch (ClassNotFoundException e) {
            e.printStackTrace();//TODO: need to Add the logger
        }
    }

    public void addHuman(Human human) {
        if (human != null)
            humans.add(human);
    }

    public void removeHuman(int index) {
        if (humans.size() < index)
            humans.remove(index);
    }

    public void addHumanAction(int humanIndex, HumanAction action) {
        if (humans != null && humans.size() > humanIndex){
            humans.get(humanIndex).addHumanAction(action);
        }
    }

    public void removeHumanAction(int humanIndex, int actionIndex) {
        if (humans != null && humans.size() > humanIndex){
            humans.get(humanIndex).removeHumanAction(actionIndex);
        }
    }

    public abstract void addHuman(String humanName) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException ;
}
