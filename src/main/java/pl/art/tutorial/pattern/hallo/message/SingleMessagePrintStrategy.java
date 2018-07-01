package pl.art.tutorial.pattern.hallo.message;

import pl.art.tutorial.pattern.hallo.MessageFactory;
import pl.art.tutorial.pattern.hallo.ProgramArgument;
import pl.art.tutorial.pattern.hallo.print.Printer;

class SingleMessagePrintStrategy implements MessagePrintStrategy {

    private final MessageFactory messageFactory;

    public SingleMessagePrintStrategy(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    @Override
    public void print(Printer printer, ProgramArgument argument) {
        String message = messageFactory.generate(argument);
        printer.print(message);
    }
}
