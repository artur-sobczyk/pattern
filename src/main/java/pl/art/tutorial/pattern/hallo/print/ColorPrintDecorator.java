package pl.art.tutorial.pattern.hallo.print;

public class ColorPrintDecorator implements Printer {

    private Printer printer;
    private String colorTag;

    public ColorPrintDecorator(Printer printer, String colorTag) {
        this.printer = printer;
        this.colorTag = colorTag;
    }

    @Override
    public void print(String message) {
        printer.print(colorTag + message + Printer.ANSI_RESET);
    }
}
