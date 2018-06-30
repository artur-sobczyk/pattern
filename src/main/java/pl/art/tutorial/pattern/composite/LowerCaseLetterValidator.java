package pl.art.tutorial.pattern.composite;

import java.util.Collections;
import java.util.List;

public class LowerCaseLetterValidator implements Validator {

    @Override
    public List<Error> validate(String text) {
        for (Character c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return Collections.emptyList();
            }
        }
        return Collections.singletonList(new Error("no lowercase letter"));
    }
}
