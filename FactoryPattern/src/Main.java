
public class Main {

	public static void main(String[] args) {

		SoundsFactory soundsFactory = new SoundsFactory();

		ISounds animal = soundsFactory.getInstance("Cow");

		animal.makeSound();

	}

}
