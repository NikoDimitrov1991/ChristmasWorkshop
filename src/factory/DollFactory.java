package factory;

public class DollFactory extends ToyFactory {

    @Override
    public Toy createAToy(String toyName) {
        if (toyName.equalsIgnoreCase("barbie doll")) {
            return new BarbieDoll();
        }
        if (toyName.equalsIgnoreCase("wooden doll")) {
            return new WoodenDoll();
        }
        System.out.println("Unknown doll type!");
        return null;
    }
}
