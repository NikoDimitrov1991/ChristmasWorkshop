import fundamental.Dwarf;
import fundamental.Santa;
import fundamental.WishBoard;

public class Main {
    public static Santa santaInstance = Santa.getInstance();
    static class Workshop {

        public WishBoard wishBoard;

        public Dwarf dwarf;

        public Workshop(String dwarfName) {
            wishBoard = new WishBoard();
            dwarf = new Dwarf(dwarfName);
            wishBoard.subscribe(dwarf);
        }

        public WishBoard getWishBoard() {
            return wishBoard;
        }
    }

    public static void main(String[] args) {
        Workshop santasWorkshop = new Workshop("Gosho");
        santaInstance.requestAToy("wooden doll", santasWorkshop.getWishBoard());
        santaInstance.requestAToy("barbie doll", santasWorkshop.getWishBoard());
        santaInstance.requestAToy("mountain bike", santasWorkshop.getWishBoard());
        santaInstance.requestAToy("touring bike", santasWorkshop.getWishBoard());
        santaInstance.requestAToy("road bike", santasWorkshop.getWishBoard());
        santaInstance.showAllToys();
    }
}