package factory;

public class RoadBike extends Toy {

    @Override
    public void prepare() {
        setName("road bike");
        System.out.println("Assembling a road bike!");
    }
}
