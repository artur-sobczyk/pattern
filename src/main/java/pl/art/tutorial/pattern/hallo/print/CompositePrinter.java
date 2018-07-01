package pl.art.tutorial.pattern.hallo.print;

import java.util.Arrays;
import java.util.List;

public class CompositePrinter extends Printer {

    private List<Printer> printer;

    public CompositePrinter(Printer... printer) {
        this.printer = Arrays.asList(printer);
    }

    @Override
    public void print(String message) {
        printer.forEach(p -> p.print(message));
    }

    @Override
    public void init() {
        printer.forEach(p -> p.init());
    }

    @Override
    public void close() {
        printer.forEach(p -> p.close());
    }
}
