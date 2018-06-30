package pl.art.tutorial.pattern.decorator;


import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

public class CachingDecorator implements CalculationOperation {

    private CalculationOperation operation;
    private Map<Pair<Integer, Integer>, Integer> cache = new HashMap<>();

    public CachingDecorator(CalculationOperation operation) {
        this.operation = operation;
    }

    @Override
    public int execute(int a, int b) {

        Pair<Integer, Integer> key = Pair.of(a, b);

        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            int result = operation.execute(a, b);
            cache.put(key, result);
            return result;
        }
    }
}