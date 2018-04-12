package hackerrank.java.advanced;


public class SingletonExample {

	private volatile static SingletonExample instance;
	public static String str;

	private SingletonExample() {
	}
	
	static SingletonExample getSingleInstance() {
		if (instance == null) {
			synchronized (SingletonExample.class) {
				if (instance == null) {
					instance = new SingletonExample();
				}
			}
		}
		return instance;
	}
}
