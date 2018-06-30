package pl.art.tutorial.pattern.builder.bloch;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class User2 {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String countryCode;
}
