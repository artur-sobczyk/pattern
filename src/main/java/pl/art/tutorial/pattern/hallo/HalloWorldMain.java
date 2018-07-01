package pl.art.tutorial.pattern.hallo;

import pl.art.tutorial.pattern.hallo.print.MessagePrintStrategy;
import pl.art.tutorial.pattern.hallo.print.MessagePrintStrategyFactory;

import java.util.Arrays;

public class HalloWorldMain {

    public static void main(String[] args){

        ProgramArgument argument = ProgramArgument.builder()
                .setArgs(Arrays.asList(args))
                .build();

        MessageFactory messageFactory = new MessageFactory();
        MessagePrintStrategyFactory messagePrintStrategyFactory = new MessagePrintStrategyFactory(messageFactory);


        MessagePrintStrategy strategy = messagePrintStrategyFactory.create(argument);
        strategy.print(argument);
    }
}
