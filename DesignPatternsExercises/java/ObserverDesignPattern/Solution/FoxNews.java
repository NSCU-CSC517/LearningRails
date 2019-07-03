// public class FoxNews extends __________(5)__________ {
public class FoxNews extends Observer {
	public FoxNews(BreakingNewsFeed breakingNewsFeed) {
		// __________(6)__________(breakingNewsFeed);
		super(breakingNewsFeed);
	}

	@Override
	public void sendNotification() {
		System.out.println("Fox Alert: " + breakingNewsFeed.getBreakingNews());
	}
}
