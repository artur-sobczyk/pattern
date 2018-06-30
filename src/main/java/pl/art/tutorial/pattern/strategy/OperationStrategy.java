package pl.art.tutorial.pattern.strategy;

public interface OperationStrategy {

    int operate(Integer... ints);

    String operationName();
}
