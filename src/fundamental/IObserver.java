package fundamental;

public interface IObserver {

    void update();

    void setWishBoard(IObservable topic);

    void removeWishBoard();
}
