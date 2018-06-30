package pl.art.tutorial.pattern.observer;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
public class DirMonitor implements DirChangeObserver.DirChangePublisher {

    File monitoredDir;
    Set<String> currentFilesInDir;
    List<DirChangeObserver> observers = new ArrayList<>();

    public DirMonitor(File monitoredDir) {
        this.monitoredDir = monitoredDir;
        currentFilesInDir = Sets.newHashSet(monitoredDir.list());
    }

    public void checkDirState() {
        Set<String> newList = Sets.newHashSet(monitoredDir.list());

        if (!newList.equals(currentFilesInDir)) {
            log.info("change in: " + monitoredDir.getAbsolutePath());
            Set<String> newFiles = Sets.newHashSet(newList);
            newFiles.removeAll(currentFilesInDir);
            Set<String> deletedFiles = Sets.newHashSet(currentFilesInDir);
            deletedFiles.removeAll(newList);
            currentFilesInDir = newList;
            observers.forEach(o -> o.dirChanged(newFiles, deletedFiles));
        }
    }

    @Override
    public void addObserver(DirChangeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DirChangeObserver observer) {
        observers.remove(observer);
    }
}
