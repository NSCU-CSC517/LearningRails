import java.util.ArrayList;
import java.util.List;

public class BreakingNewsFeed {
	String breakingNews;
	List<Observer> observers = new ArrayList<>();

	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	public String getBreakingNews() {
		return breakingNews;
	}

	public void setBreakingNews(String breakingNews) {
		this.breakingNews = breakingNews;
		// __________(1)__________;
		notifySubsrcribers();
	}

	private void notifySubsrcribers() {
		for(Observer observer : observers)
			// observer.__________(2)__________();
			observer.sendNotification();
	}
}
