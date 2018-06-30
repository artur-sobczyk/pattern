package pl.art.tutorial.pattern.state;

public class Printer {

    private ColorPrinter colorPrinter = new ColorPrinter();

    public void setColor(String color) {

        if ("red".equals(color)) {
            colorPrinter = new RedPrinter();

        } else if ("green".equals(color)) {
            colorPrinter = new GreenPrinter();

        } else if ("blues".equals(color)) {
            colorPrinter = new BluePrinter();

        } else {
            colorPrinter = new ColorPrinter();
        }
    }

    public void print(String message) {
        colorPrinter.print(message);
    }


}
