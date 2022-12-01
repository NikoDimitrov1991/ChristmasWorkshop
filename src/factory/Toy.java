package factory;

public abstract class Toy {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    @Override
    public String toString() {
        return "Toy{" +
                "name=" + name +
                '}';
    }
}
