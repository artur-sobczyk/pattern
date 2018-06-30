package pl.art.tutorial.pattern.observer;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class ObserverMain {

    public static void main(String... args) {

        DirMonitor monitor = new DirMonitor(new File("."));

        monitor.addObserver(((newFiles, deletedFiles) -> {
            log.info("newFiles: " + newFiles);
            log.info("deletedFiles: " + deletedFiles);
        }));

        while(true){
            monitor.checkDirState();
            sleep(1000);
        }
    }

    @SneakyThrows
    static void sleep(long mils){
        Thread.sleep(mils);
    }
}
