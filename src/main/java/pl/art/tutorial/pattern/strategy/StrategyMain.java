package pl.art.tutorial.pattern.strategy;

import lombok.extern.slf4j.Slf4j;
import pl.art.tutorial.pattern.observer.DirMonitor;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

@Slf4j
public class StrategyMain {

    public static void main(String... args) {

        OperationStrategy strategy;

        if (Arrays.asList(args).contains("mediana")) {
            strategy = new MedianStrategy();
        } else {
            strategy = new AverageStrategy();
        }

        ReportGenerator reportGenerator = new ReportGenerator(strategy);

        while (true) {
            Integer[] ints = readLine("provide ints: ");
            reportGenerator.print(ints);
        }
    }

    private static Integer[] readLine(String query) {
        Scanner sc = new Scanner(System.in);
        System.out.print(query);
        return Stream.of(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.valueOf(e))
                .boxed()
                .toArray(Integer[]::new);
    }
}
