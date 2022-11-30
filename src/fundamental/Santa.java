package fundamental;

import factory.Toy;

import java.util.ArrayList;
import java.util.List;

public class Santa {

    private static Santa instance;

    private final List<Toy> toysWarehouse;

    private Santa() {
        toysWarehouse = new ArrayList<>();
    }

    public static Santa getInstance() {
        if (instance == null) {
            instance = new Santa();
        }
        return instance;
    }

    public void addAToy(Toy toy) {
        if (toy != null) {
            toysWarehouse.add(toy);
        } else {
            throw new IllegalArgumentException("Toy cannot be null!");
        }
    }

    public void showAllToys() {
        for (Toy toy : toysWarehouse) {
            System.out.println(toy.toString() + ", ");
        }
        System.out.println("The number of toys in Santa's warehouse is: " + toysWarehouse.size());
    }
}
