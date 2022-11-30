package factory;

public class BikeFactory extends ToyFactory {

    @Override
    public Toy createAToy(String toyName) {
        if (toyName.equalsIgnoreCase("folding bike")) {
            return new FoldingBike();
        }

        if (toyName.equalsIgnoreCase("mountain bike")) {
            return new MountainBike();
        }

        if (toyName.equalsIgnoreCase("road bike")) {
            return new RoadBike();
        }

        if (toyName.equalsIgnoreCase("touring bike")) {
            return new TouringBike();
        }
        System.out.println("Unknown bike type!");
        return null;
    }
}
