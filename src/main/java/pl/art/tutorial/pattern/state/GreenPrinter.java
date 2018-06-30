package pl.art.tutorial.pattern.state;

public class GreenPrinter extends ColorPrinter {

    @Override
    public void print(String message) {
        super.print(ANSI_GREEN + message + ANSI_RESET);
    }
}