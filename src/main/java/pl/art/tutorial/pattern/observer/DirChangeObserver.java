package pl.art.tutorial.pattern.observer;

import java.util.Set;

public interface DirChangeObserver {

    void dirChanged(Set<String> newFiles, Set<String> deletedFiles);

    interface DirChangePublisher{

        void addObserver(DirChangeObserver observer);

        void removeObserver(DirChangeObserver observer);
    }
}
