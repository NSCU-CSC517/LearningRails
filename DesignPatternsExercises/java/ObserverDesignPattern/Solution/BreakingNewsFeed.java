import java.util.ArrayList;
import java.util.List;

public class BreakingNewsFeed {
    String breakingNews;
    // List<__________(1)__________> observers = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public String getBreakingNews() {
        return breakingNews;
    }

    public void setBreakingNews(String breakingNews) {
        this.breakingNews = breakingNews;
        // __________(2)__________;
        notifySubscribers();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    private void notifySubscribers() {
        for (Observer observer : observers)
            // observer.__________(3)__________();
            observer.sendNotification();
    }
}
