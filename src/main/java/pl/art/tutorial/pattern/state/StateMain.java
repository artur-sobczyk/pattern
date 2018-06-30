package pl.art.tutorial.pattern.state;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StateMain {

    static Printer printer = new Printer();

    public static void main(String... args) {
        while (true) {

            String command = readLine("command: ");

            if (StringUtils.startsWith(command, "set")) {
                printer.setColor(command.split("\\s+")[1]);

            } else if (StringUtils.equals(command, "exit")) {
                System.exit(0);

            } else {
                printer.print(command);
            }
        }
    }

    private static String readLine(String query) {
        Scanner sc = new Scanner(System.in);
        System.out.print(query);
        return sc.nextLine();
    }
}
