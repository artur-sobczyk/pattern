package pl.art.tutorial.pattern.composite;

public class UpperCaseLetterValidator implements Validator {

    @Override
    public void validate(String text) {
        for (Character c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return;
            }
        }
        throw new IllegalArgumentException("no uppercase letter");
    }
}
