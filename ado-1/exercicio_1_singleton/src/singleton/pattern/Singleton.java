package singleton.pattern;

public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) { // Implementando thread safe no singleton
				if (singleton == null) {
					singleton = new Singleton();			
				}
			}
		}
		return singleton;
	}

}
