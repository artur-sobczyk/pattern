package pl.art.tutorial.pattern.composite;

import java.util.List;
import java.util.Scanner;

public class CompositeMain {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("password: ");
        String password = sc.nextLine();

        //Validator validator = new MinLengthValidator();
        Validator validator = new CompositValidator(
                new MinLengthValidator(),
                new UpperCaseLetterValidator(),
                new LowerCaseLetterValidator()
        );

        List<Validator.Error> errorList = validator.validate(password);

        if (errorList.isEmpty()) {
            System.out.println("password ok");

        } else {
            System.out.println("Invalid password: " + errorList);
        }
    }
}
