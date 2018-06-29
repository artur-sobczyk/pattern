package pl.art.tutorial.pattern.singleton.doublecheckedlocking;

public class Singleton {

	private static volatile Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void doSomething() {
		// do some stuff here
	}
}
