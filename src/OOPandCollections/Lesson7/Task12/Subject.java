package OOPandCollections.Lesson7.Task12;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
