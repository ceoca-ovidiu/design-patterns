
public class SoundsFactory {

	public ISounds getInstance(String animal) {
		if (animal.equalsIgnoreCase("Cat"))
			return new Cat();
		else if (animal.equalsIgnoreCase("Dog"))
			return new Dog();
		else if (animal.equalsIgnoreCase("Duck"))
			return new Duck();
		else
			return new Cow();
	}
}
