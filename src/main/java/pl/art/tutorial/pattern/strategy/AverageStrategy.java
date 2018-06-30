package pl.art.tutorial.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.Stream;

@Slf4j
public class AverageStrategy implements OperationStrategy {

    @Override
    public int operate(Integer... ints) {
        int retVal = (int) Stream.of(ints)
                .mapToInt(i -> i)
                .average()
                .orElse(0d);

        return retVal;
    }

    @Override
    public String operationName() {
        return "average";
    }
}