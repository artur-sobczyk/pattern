package pl.art.tutorial.pattern.hallo.print;

import pl.art.tutorial.pattern.hallo.Message;

public abstract class Printer {

    public void init() {
    }

    public abstract void print(Message message);

    public void close() {
    }

}
