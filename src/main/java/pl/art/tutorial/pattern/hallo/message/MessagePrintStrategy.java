package pl.art.tutorial.pattern.hallo.message;

import pl.art.tutorial.pattern.hallo.ProgramArgument;
import pl.art.tutorial.pattern.hallo.print.Printer;

public interface MessagePrintStrategy {

    void print(Printer printer, ProgramArgument argument);
}
