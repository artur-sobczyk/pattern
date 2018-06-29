package pl.art.tutorial.pattern.composite;

import org.apache.commons.lang3.StringUtils;

public class MinLengthValidator implements Validator {

    private int minLength = 8;

    @Override
    public void validate(String text) {
        if(StringUtils.length(text) < minLength){
            throw new IllegalArgumentException("to short, min length is " + minLength);
        }
    }
}
