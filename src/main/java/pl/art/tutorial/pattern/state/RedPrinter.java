package pl.art.tutorial.pattern.state;

public class RedPrinter extends ColorPrinter {

    @Override
    public void print(String message) {
        super.print(ANSI_RED + message + ANSI_RESET);
    }
}
