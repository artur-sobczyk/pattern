package pl.art.tutorial.pattern.hallo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MessageParameters {

    private String userName;
    private Gender gender = Gender.NON_BINARY;
    private boolean interactive;
    private String color;

    public enum Gender{
        MALE("Mr."),
        FEMALE("Mrs."),
        NON_BINARY(""),
        NOT_DEFINED("");

        Gender(String prefix) {
            this.prefix = prefix;
        }

        private String prefix;
    }

    public String getMessage() {
        return gender.prefix + " " + userName;
    }
}
