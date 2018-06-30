package pl.art.tutorial.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
public class MedianStrategy implements OperationStrategy {

    @Override
    public int operate(Integer... ints) {

        List<Integer> list = Arrays.asList(ints);
        Collections.sort(list);

        int retVal;

        if (list.size() % 2 == 0) {
            retVal = (list.get(list.size() / 2 -1) + list.get(list.size() / 2)) / 2;
        } else {
            retVal = list.get(list.size() / 2);
        }
        return retVal;
    }

    @Override
    public String operationName() {
        return "median";
    }
}
