package pl.art.tutorial.pattern.builder.bloch;

public class BuilderMain {

    public static void main(String... args) {
        User user = User.builder().build();
        System.out.print(user);
    }
}
