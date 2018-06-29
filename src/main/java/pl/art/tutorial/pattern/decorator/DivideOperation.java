package pl.art.tutorial.pattern.decorator;

public class DivideOperation implements CalculationOperation {

    @Override
    public int execute(int a, int b) {
        return a/b;
    }
}
