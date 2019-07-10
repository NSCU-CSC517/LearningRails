// public __________(7)__________ class Observer {
public abstract class Observer {
    protected BreakingNewsFeed breakingNewsFeed;

    public Observer(BreakingNewsFeed breakingNewsFeed) {
        this.breakingNewsFeed = breakingNewsFeed;
        // breakingNewsFeed.__________(8)__________;
        breakingNewsFeed.subscribe(this);
    }

    // public __________(9)__________ void __________(10)__________();
    public abstract void sendNotification();
}
