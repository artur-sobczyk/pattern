package pl.art.tutorial.pattern.hallo;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MessageFactory {

    public Message generate(MessageParameters parameters) {

        if (StringUtils.isNoneEmpty(parameters.getUserName())) {
            return Message.builder().message("Hallo " + parameters.getMessage()).build();

        } else if (parameters.isInteractive()) {
            String userName = readLine("userName: ");
            String gender = readLine("gender: ");
            String color = readLine("color: ");

            MessageParameters messageParameters = MessageParameters.builder()
                    .gender(MessageParameters.Gender.valueOf(StringUtils.trimToEmpty(StringUtils.upperCase(gender))))
                    .userName(userName)
                    .color(color)
                    .build();

            return Message.builder()
                    .message("Hallo " + messageParameters.getMessage())
                    .color(messageParameters.getColor())
                    .build();

        } else {
            return Message.builder().message("Hallo World").build();
        }
    }

    private static String readLine(String query) {
        Scanner sc = new Scanner(System.in);
        System.out.print(query);
        return sc.nextLine();
    }
}
