package pl.art.tutorial.pattern.observer;

public interface DirChangePublisher{

    void addObserver(DirChangeObserver observer);

    void removeObserver(DirChangeObserver observer);
}
