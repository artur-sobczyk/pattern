package pl.art.tutorial.pattern.observer;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileReader;
import java.util.Set;

@Slf4j
public class ObserverMain {

    public static void main(String... args) {

        DirMonitor monitor = new DirMonitor(new File("."));

        monitor.addObserver(new DirChangeObserver() {
            @Override
            public void dirChanged(Set<String> newFiles, Set<String> deletedFiles) {
                log.info("newFiles: " + newFiles);
                log.info("deletedFiles: " + deletedFiles);

            }
        });

        monitor.addObserver(new DirChangeObserver() {
            @Override
            public void dirChanged(Set<String> newFiles, Set<String> deletedFiles) {
                newFiles.forEach(file -> {
                    try (FileReader fr = new FileReader(file)){
                        String content = IOUtils.toString(fr);
                        log.info(content);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
        });

        while (true) {
            monitor.checkDirState();
            sleep(1000);
        }
    }

    @SneakyThrows
    static void sleep(long mils) {
        Thread.sleep(mils);
    }
}
