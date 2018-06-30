package pl.art.tutorial.pattern.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

public interface Validator {

    List<Error> validate(String text);

    @ToString
    @AllArgsConstructor
    class Error {
        String message;
    }
}
