package pl.art.tutorial.pattern.factory.example;


import org.apache.commons.io.IOUtils;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MessageFactoryExample {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("languageCode: ");
        String languageCode = sc.nextLine();

        String message = new MessageFactory().createMessage(languageCode);

        System.out.println(message);
    }
}

class MessageFactory {

    Map<String, String> messages = getMessages();

    String createMessage(String languageCode) {
        return messages.get(languageCode);
    }

    private Map<String, String> getMessages() {
        try (FileReader fr = new FileReader("messages.text")){

            List<String> lines = IOUtils.readLines(fr);
            Map<String, String> messagesMap = new HashMap<>();
            lines.forEach((line) -> {
                String key = line.split(":")[0];
                String value = line.split(":")[1];
                messagesMap.put(key, value);
            });
            return messagesMap;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}