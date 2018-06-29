package pl.art.tutorial.pattern.adapter;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class AdapterMain {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("command: ");
        String command = sc.nextLine();

        TextLoader textLoader;
        if (StringUtils.equals(command, "file")) {
            textLoader = new FileAdapter();
        } else {
            textLoader = new MemoryAdapter("Ala ma kota z pamięci.");
        }
        print(textLoader);
    }

    private static void print(TextLoader textLoader) {
        String word = textLoader.getNextWord();
        while (word != null) {
            System.out.print(word + " ");
            word = textLoader.getNextWord();
        }
    }
}
