package pl.art.tutorial.pattern.singleton.lazy;

public class Singleton {

	private static volatile Singleton instance = null;

	private Singleton() {
	}

	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void doSomething() {
		// do some stuff here
	}
}
