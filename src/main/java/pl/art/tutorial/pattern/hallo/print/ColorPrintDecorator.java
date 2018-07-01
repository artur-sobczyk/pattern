package pl.art.tutorial.pattern.hallo.print;

import com.google.common.collect.ImmutableMap;
import pl.art.tutorial.pattern.hallo.Message;

import java.util.Map;

public class ColorPrintDecorator extends Printer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final Map<String, String> COLOR_MAP = ImmutableMap.<String, String>builder()
            .put("red", ANSI_RED)
            .put("blue", ANSI_BLUE)
            .put("yellow", ANSI_YELLOW)
            .build();

    private Printer printer;
    private String color;

    public ColorPrintDecorator(Printer printer, String color) {
        this.printer = printer;
        this.color = color;
    }

    @Override
    public void print(Message message) {

        Message collaredMessage;

        if (COLOR_MAP.containsKey(message.getColor())) {
            collaredMessage = colorMessage(message.getColor(), message);

        } else if (COLOR_MAP.containsKey(color)) {
            collaredMessage = colorMessage(color, message);

        } else {
            collaredMessage = message;
        }

        printer.print(collaredMessage);
    }

    private Message colorMessage(String color, Message message) {
        return Message.builder()
                .message(COLOR_MAP.get(color) + message.getMessage() + ANSI_RESET).build();
    }
}
