package pl.art.tutorial.pattern.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefinedNumberGenerator implements NumberGenerator {

    List<Integer> numbers = new ArrayList<>();
    int index = 0;

    DefinedNumberGenerator(Integer... numbers){
        this.numbers = Arrays.asList(numbers);
    }

    @Override
    public Integer nextNumber() {
        return numbers.get(index++);
    }
}
