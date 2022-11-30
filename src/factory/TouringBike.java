package factory;

public class TouringBike extends Toy {

    @Override
    public void prepare() {
        setName("touring bike");
        System.out.println("Assembling a touring bike!");
    }
}
