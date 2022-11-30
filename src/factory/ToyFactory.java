package factory;

public abstract class ToyFactory {

    public abstract Toy createAToy(String toyName);

    public Toy produceAToy(String toyName) {
        Toy toy = createAToy(toyName);
        toy.prepare();
        return toy;
    }
}
