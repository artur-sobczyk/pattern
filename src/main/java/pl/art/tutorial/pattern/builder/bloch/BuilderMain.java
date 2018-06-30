package pl.art.tutorial.pattern.builder.bloch;

import java.util.Scanner;

public class BuilderMain {

    public static void main(String... args) {

        User.Builder builder = User.maleBuilder();
        //....
        Scanner sc = new Scanner(System.in);
        System.out.print("firstName: ");
        String firstName = sc.nextLine();
        builder.firstName(firstName);

        // ...
        System.out.print(builder.build());
    }
}
