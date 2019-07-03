public class FoxNews extends __________(5)__________ {
	public FoxNews(BreakingNewsFeed breakingNewsFeed) {
		__________(6)__________(breakingNewsFeed);
	}

	@Override
	public void sendNotification() {
		System.out.println("Fox Alert: " + breakingNewsFeed.getBreakingNews());
	}
}
