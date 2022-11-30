package factory;

public class WoodenDoll extends Toy {
    @Override
    public void prepare() {
        setName("wooden doll");
        System.out.println("Assembling a wooden doll!");
    }
}
