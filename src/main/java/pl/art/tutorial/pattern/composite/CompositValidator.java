package pl.art.tutorial.pattern.composite;

import java.util.Arrays;
import java.util.Collection;

public class CompositValidator implements Validator {

    private Collection<Validator> validators;

    public CompositValidator(Validator... validators) {
        this.validators = Arrays.asList(validators);
    }

    @Override
    public void validate(String text) {
        validators.forEach(v -> v.validate(text));
    }
}
