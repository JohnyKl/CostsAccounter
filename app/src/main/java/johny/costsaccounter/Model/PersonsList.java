package johny.costsaccounter.Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import johny.costsaccounter.Model.Interfaces.Saveable;

/**
 * Created by Johny on 21.06.2017.
 */
public class PersonsList implements Saveable {

    public final static String FILE_PATH = "persons.sd";

    @Override
    public void save(String filePath) {
        if (filePath == null || filePath.isEmpty()) filePath = FILE_PATH;

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
            out.writeObject(persons);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();//TODO: need to Add the logger
        }
    }

    @Override
    public void load(String filePath) {
        if (filePath == null || filePath.isEmpty()) filePath = FILE_PATH;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream oin = new ObjectInputStream(fis);
            persons = (ArrayList<Person>) oin.readObject();
        } catch (IOException e) {
            e.printStackTrace();//TODO: need to Add the logger
        } catch (ClassNotFoundException e) {
            e.printStackTrace();//TODO: need to Add the logger
        }
    }

    public void addPerson(Person person) {
        if (person != null)
            persons.add(person);
    }

    public void removePerson(int index) {
        if (persons.size() < index)
            persons.remove(index);
    }

    public void addPerson(String personName) {
        Person p = new Person(personName);
        persons.add(p);
    }

    private ArrayList<Person> persons = new ArrayList<Person>();
}
