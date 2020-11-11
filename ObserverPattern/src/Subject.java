import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observersList = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void addObserver(Observer observer) {

		observersList.add(observer);

	}

	public void notifyAllObservers() {

		for (Observer observer : observersList) {
			observer.update();
		}

	}

}
