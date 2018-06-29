package pl.art.tutorial.pattern.builder.bloch;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String countryCode;

    public static Builder builder(){
        return new Builder();
    }

    public User(String firstName, String lastName, String gender, LocalDate dateOfBirth, String countryCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.countryCode = countryCode;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String gender;
        private LocalDate dateOfBirth;
        private String countryCode;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder firstName(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public User build(){
            return new User(firstName, lastName, gender, dateOfBirth, countryCode);
        }
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
