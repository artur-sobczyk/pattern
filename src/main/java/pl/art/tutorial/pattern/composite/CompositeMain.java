package pl.art.tutorial.pattern.composite;

import java.util.Scanner;

public class CompositeMain {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.print("password: ");
        String password = sc.nextLine();
        //Validator validator = new MinLengthValidator();
        Validator validator = new CompositValidator(new MinLengthValidator(), new UpperCaseLetterValidator());

        try {
            validator.validate(password);
            System.out.println("password ok");

        } catch (Exception e){
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
