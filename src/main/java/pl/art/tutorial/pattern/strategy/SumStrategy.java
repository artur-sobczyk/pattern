package pl.art.tutorial.pattern.strategy;

import java.util.stream.Stream;

public class SumStrategy implements OperationStrategy {

    @Override
    public int operate(Integer... ints) {
        return Stream.of(ints).mapToInt(i -> i).sum();
    }

    @Override
    public String operationName() {
        return "sum";
    }
}
