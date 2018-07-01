package pl.art.tutorial.pattern.hallo.print;

import pl.art.tutorial.pattern.hallo.MessageFactory;
import pl.art.tutorial.pattern.hallo.ProgramArgument;

class SingleMessagePrintStrategy implements MessagePrintStrategy {

    private final MessageFactory messageFactory;

    public SingleMessagePrintStrategy(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    @Override
    public void print(ProgramArgument argument) {
        String message = messageFactory.generate(argument);
        System.out.println(message);
    }
}
