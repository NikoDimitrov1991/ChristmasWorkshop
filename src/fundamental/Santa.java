package fundamental;

import command.*;
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
    public void requestAToy(String wantedToy, WishBoard wishBoard) {
        ICommand command = null;
        switch (wantedToy.toLowerCase()) {
            case "barbie doll" -> command = new GiveMeABarbieDoll(wishBoard);
            case "wooden doll" -> command = new GiveMeAWoodenDoll(wishBoard);
            case "mountain bike" -> command = new GiveMeAMountainBike(wishBoard);
            case "road bike" -> command = new GiveMeARoadBike(wishBoard);
            case "folding bike" -> command = new GiveMeAFoldingBike(wishBoard);
            case "touring bike" -> command = new GiveMeATouringBike(wishBoard);
            default -> System.out.println("Santa cannot ask for such toy!");
        }
        if(command == null) {
            throw new IllegalArgumentException("Null toy given!");
        }
        command.execute();
    }
}
