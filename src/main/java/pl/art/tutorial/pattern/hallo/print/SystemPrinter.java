package pl.art.tutorial.pattern.hallo.print;

public class SystemPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
