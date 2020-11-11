
public class Singleton {

	private static Singleton singletonInstance = new Singleton();

	private Singleton() {
	};

	public static Singleton getInstance() {
		return singletonInstance;
	}

	public void basicOperation() {
		System.out.println("The sum is : " + (3 + 4));
	}

}
