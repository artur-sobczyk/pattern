package pl.art.tutorial.pattern.singleton.eager;

public class Singleton {

	public static final Singleton INSTANCE = new Singleton();

	private Singleton() {
	}

	public void doSomething() {
		// do some stuff here
	}
}
