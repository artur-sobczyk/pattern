package pl.art.tutorial.pattern.hallo;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MessageFactory {

    public String generate(ProgramArgument argument) {

        if (StringUtils.isNoneEmpty(argument.getUserName())) {
            return "Hallo " + argument.getUserName();

        } else if (argument.isInteractive()) {
            String fistName = readLine("fistName: ");
            return "Hallo " + fistName;

        } else {
            return "Hallo World";
        }
    }

    private static String readLine(String query) {
        Scanner sc = new Scanner(System.in);
        System.out.print(query);
        return sc.nextLine();
    }
}
