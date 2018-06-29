package pl.art.tutorial.pattern.decorator;

public class MonitoringDecorator implements CalculationOperation {

    private CalculationOperation operation;
    private int succeses = 0;
    private int failures = 0;

    public MonitoringDecorator(CalculationOperation operation) {
        this.operation = operation;
    }

    @Override
    public int execute(int a, int b) {
        try {
            int value = operation.execute(a, b);
            succeses++;
            return value;
        } catch (RuntimeException e) {
            failures++;
            throw e;
        }
    }

    @Override
    public String toString() {
        return "MonitoringDecorator{" +
                "succeses=" + succeses +
                ", failures=" + failures +
                '}';
    }
}
