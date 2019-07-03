// public __________(9)__________ class Observer {
public abstract class Observer {
	BreakingNewsFeed breakingNewsFeed;

	public Observer(BreakingNewsFeed breakingNewsFeed) {
		this.breakingNewsFeed = breakingNewsFeed;
		// breakingNewsFeed.__________(10)__________;
		breakingNewsFeed.subscribe(this);
	}

	// public abstract void __________(11)__________();
	public abstract void sendNotification();
}
