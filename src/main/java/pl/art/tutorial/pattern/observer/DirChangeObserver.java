package pl.art.tutorial.pattern.observer;

import java.util.Set;

public interface DirChangeObserver {

    void dirChanged(Set<String> newFiles, Set<String> deletedFiles);


}
