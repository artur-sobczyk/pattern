package pl.art.tutorial.pattern.state;

public class BluePrinter extends ColorPrinter {

    @Override
    public void print(String message) {
        super.print(ANSI_BLUE + message + ANSI_RESET);
    }
}

