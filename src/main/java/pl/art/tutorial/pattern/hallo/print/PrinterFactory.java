package pl.art.tutorial.pattern.hallo.print;

import pl.art.tutorial.pattern.hallo.ProgramArgument;

public class PrinterFactory {

    public Printer create(ProgramArgument argument) {
        return addFilePrinter(new ColorPrintDecorator(new SystemPrinter(), argument.getColor()));
    }

    private Printer addFilePrinter(Printer printer) {
        return new CompositePrinter(printer, new FilePrinter());
    }
}
