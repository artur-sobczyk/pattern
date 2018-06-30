package pl.art.tutorial.pattern.composite;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;

public class MinLengthValidator implements Validator {

    private int minLength = 8;

    @Override
    public List<Error> validate(String text) {
        if (StringUtils.length(text) < minLength) {
            return Collections.singletonList(new Error("to short, min length is " + minLength));
        }
        return Collections.emptyList();
    }
}
