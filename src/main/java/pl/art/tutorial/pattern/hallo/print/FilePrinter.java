package pl.art.tutorial.pattern.hallo.print;


import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import pl.art.tutorial.pattern.hallo.Message;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FilePrinter extends Printer {

    private static final String REPORT_FILE = "report.txt";
    private static final String LOG_TEMPLATE = "%s %s";
    private FileWriter fileWriter;

    @Override
    @SneakyThrows
    public void print(Message message) {
        fileWriter.append(String.format(LOG_TEMPLATE, LocalDateTime.now(), message.getMessage()) + "\n");
    }

    public void init() {
        try {
            fileWriter = new FileWriter(REPORT_FILE, true);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void close() {
        IOUtils.closeQuietly(fileWriter);
    }
}
