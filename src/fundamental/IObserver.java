package fundamental;

public interface IObserver {

    void update();

    void setMagicBoard(IObservable topic);

    void removeMagicBoard();
}
