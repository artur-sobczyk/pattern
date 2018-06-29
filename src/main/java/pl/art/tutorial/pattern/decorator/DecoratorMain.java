package pl.art.tutorial.pattern.decorator;

public class DecoratorMain {

    public static void main(String... args) {

        CalculationOperation operation = new DivideOperation();
        MonitoringDecorator monitoringDecorator = new MonitoringDecorator(operation);

        executeIgnoringException(monitoringDecorator, 1, 1);
        executeIgnoringException(monitoringDecorator, 10, 2);
        executeIgnoringException(monitoringDecorator, 1, 0);
        executeIgnoringException(monitoringDecorator, 2, 3);
        System.out.println(monitoringDecorator);
    }

    private static void executeIgnoringException(CalculationOperation operation, int a, int b) {
        try {
            System.out.println(a + "/" + b + "=" + operation.execute(a, b));
        } catch (RuntimeException e) {
            System.out.println(e.getClass());
        }
    }
}
