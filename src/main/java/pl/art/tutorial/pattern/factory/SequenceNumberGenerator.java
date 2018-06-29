package pl.art.tutorial.pattern.factory;

public class SequenceNumberGenerator implements NumberGenerator {
    private Integer currentValue = 0;

    @Override
    public Integer nextNumber() {
        return currentValue++;
    }
}