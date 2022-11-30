package factory;

public class FoldingBike extends Toy {
    @Override
    public void prepare() {
        setName("folding bike");
        System.out.println("Assembling a folding bike!");
    }
}
