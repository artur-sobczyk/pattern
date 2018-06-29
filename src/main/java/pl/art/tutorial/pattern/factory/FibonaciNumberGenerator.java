package pl.art.tutorial.pattern.factory;

public class FibonaciNumberGenerator implements NumberGenerator {
    private Integer previous = 0;
    private Integer current = 1;

    @Override
    public Integer nextNumber() {
        int temp = previous + current;
        previous = current;
        current = temp;
        return previous;
    }
}