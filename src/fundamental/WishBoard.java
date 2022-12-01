package fundamental;

import java.util.ArrayList;
import java.util.List;

public class WishBoard implements IObservable {
    private final List<IObserver> dwarfsInService;
    private String requestedToy;

    public WishBoard() {
        dwarfsInService = new ArrayList<>();
    }

    @Override
    public void subscribe(IObserver observer) {
        if (observer != null) {
            dwarfsInService.add(observer);
            observer.setWishBoard(this);
        } else {
            throw new IllegalArgumentException("The dwarf cannot be null!");
        }
    }

    @Override
    public void unsubscribe(IObserver observer) {
        if (observer != null) {
            dwarfsInService.remove(observer);
            observer.removeWishBoard();
        } else {
            throw new IllegalArgumentException("The dwarf cannot be null!");
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver dwarf : dwarfsInService) {
            dwarf.update();
        }
    }

    @Override
    public String getToy() {
        return requestedToy;
    }

    public void requestToyFromDwarfs(String requestedToyFromSanta) {
        if (requestedToyFromSanta == null || requestedToyFromSanta.isBlank()) {
            throw new IllegalArgumentException("The requested toy cannot be null or blank!");
        }
        requestedToy = requestedToyFromSanta;
        System.out.printf("%s is written on the board! \n", requestedToyFromSanta);
        notifyObservers();
        System.out.println("---------------------------------------------------");
    }
}
