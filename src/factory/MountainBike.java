package factory;

public class MountainBike extends Toy {

    @Override
    public void prepare() {
        setName("mountain bike");
        System.out.println("Assembling a mountain bike!");
    }
}
