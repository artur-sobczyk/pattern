package pl.art.tutorial.pattern.hallo.print;

import pl.art.tutorial.pattern.hallo.MessageFactory;
import pl.art.tutorial.pattern.hallo.ProgramArgument;

class InLoopMessagePrintStrategy implements MessagePrintStrategy {

    private final MessageFactory messageFactory;

    public InLoopMessagePrintStrategy(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    @Override
    public void print(ProgramArgument argument) {

        while(true){
            String message = messageFactory.generate(argument);
            System.out.println(message);
        }
    }
}
