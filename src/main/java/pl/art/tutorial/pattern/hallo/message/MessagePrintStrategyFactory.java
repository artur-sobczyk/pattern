package pl.art.tutorial.pattern.hallo.message;

import pl.art.tutorial.pattern.hallo.MessageFactory;
import pl.art.tutorial.pattern.hallo.ProgramArgument;

public class MessagePrintStrategyFactory {

    private final MessageFactory messageFactory;

    public MessagePrintStrategyFactory(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    public MessagePrintStrategy create(ProgramArgument argument){

        if(argument.isLoop()){
            return new InLoopMessagePrintStrategy(messageFactory);
        } else {
            return new SingleMessagePrintStrategy(messageFactory);
        }
    }
}
