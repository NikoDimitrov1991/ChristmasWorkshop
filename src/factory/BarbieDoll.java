package factory;

public class BarbieDoll extends Toy {
    @Override
    public void prepare() {
        setName("barbie doll");
        System.out.println("Assembling a barbie doll!");
    }
}
