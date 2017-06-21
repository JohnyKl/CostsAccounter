package johny.costsaccounter.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Johny on 21.06.2017.
 */
public class Person implements Serializable {
    public String name;

    public Person() {
        this("", 0.0);
    }

    public Person(String name) {
        this(name, 0.0);
    }

    public Person(String name, double cost) {
        IdCounter++;

        this.name = name;
        id = IdCounter;

        setCosts(cost);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCosts(double costs) {
        if (costs < 0)
            costs = 0.0;

        this.costs = costs;
    }

    public double getCosts() {
        return costs;
    }

    public void addConsumption(Consumption c)
    {
        if(c != null)
            consumptions.add(c);
    }

    public void addConsumption(double cost)
    {
        addConsumption(new Consumption(cost));
    }

    public void addConsumption(Date date, double cost)
    {
        addConsumption(new Consumption(date, cost));
    }

    void removeConsumption(int index){
        if(consumptions.size() > index) consumptions.remove(index);
    }

    private ArrayList<Consumption> consumptions = new ArrayList<Consumption>();
    private int id;
    private double costs;

    private static int IdCounter = 0;
}
