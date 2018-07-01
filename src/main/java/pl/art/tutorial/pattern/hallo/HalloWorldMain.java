package pl.art.tutorial.pattern.hallo;

import pl.art.tutorial.pattern.hallo.message.MessagePrintStrategy;
import pl.art.tutorial.pattern.hallo.message.MessagePrintStrategyFactory;
import pl.art.tutorial.pattern.hallo.print.Printer;
import pl.art.tutorial.pattern.hallo.print.PrinterFactory;

import java.util.Arrays;

public class HalloWorldMain {

    public static void main(String[] args){

        ProgramArgument argument = ProgramArgument.builder()
                .setArgs(Arrays.asList(args))
                .build();

        MessageFactory messageFactory = new MessageFactory();
        MessagePrintStrategyFactory messagePrintStrategyFactory = new MessagePrintStrategyFactory(messageFactory);
        Printer printer = new PrinterFactory().create(argument);

        algorithm(argument, messagePrintStrategyFactory, printer);
    }

    private static void algorithm(ProgramArgument argument, MessagePrintStrategyFactory messagePrintStrategyFactory, Printer printer){
        MessagePrintStrategy strategy = messagePrintStrategyFactory.create(argument);
        printer.init();
        strategy.print(printer, argument);
        printer.close();
    }
}
