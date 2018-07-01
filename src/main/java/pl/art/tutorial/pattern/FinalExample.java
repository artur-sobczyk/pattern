package pl.art.tutorial.pattern;

public class FinalExample {

    private static final int STATIC = 1;
    private final int not_static;

    public FinalExample(int not_static) {
        this.not_static = not_static;
    }

    public void main(String... s) {
        System.out.print(FinalExample.STATIC);
        System.out.print(new FinalExample(1).STATIC);

        FinalExample f1 = new FinalExample(1);
        FinalExample f2 = new FinalExample(10);

    }
}
