package pl.art.tutorial.pattern.factory;

import java.util.Arrays;
import java.util.Scanner;

public class FactoryMain {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("algorithm: ");
        String algorithm = sc.nextLine();
        NumberGenerator generator = new NumberGeneratorFactory().create(algorithm);
        print10Numbers(generator);
    }

    private static void print10Numbers(NumberGenerator generator){

        for(int i = 0; i < 10; i++){
            System.out.print(generator.nextNumber() + " ");
        }
    }
}
