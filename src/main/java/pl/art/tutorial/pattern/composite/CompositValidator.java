package pl.art.tutorial.pattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CompositValidator implements Validator {

    private Collection<Validator> validators;

    public CompositValidator(Validator... validators) {
        this.validators = Arrays.asList(validators);
    }

    @Override
    public List<Error> validate(String text) {

        List<Error> errors = new ArrayList<>();
        validators.forEach(v -> errors.addAll(v.validate(text)));
        return errors;
    }
}
