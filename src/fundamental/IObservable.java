package fundamental;

public interface IObservable {
    void subscribe(IObserver observer);

    void unsubscribe(IObserver observer);

    void notifyObservers();

    String getToy();
}
