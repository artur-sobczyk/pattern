package pl.art.tutorial.pattern.hallo.print;

import pl.art.tutorial.pattern.hallo.Message;

public class SystemPrinter extends Printer {

    @Override
    public void print(Message message) {
        System.out.println(message.getMessage());
    }
}
