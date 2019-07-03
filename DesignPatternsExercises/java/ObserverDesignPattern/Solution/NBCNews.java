// public class NBCNews extends __________(7)__________ {
public class NBCNews extends Observer {
	public NBCNews(BreakingNewsFeed breakingNewsFeed) {
		// __________(8)__________(breakingNewsFeed);
		super(breakingNewsFeed);
	}

	@Override
	public void sendNotification() {
		System.out.println("NBC Breaking News: " + breakingNewsFeed.getBreakingNews());
	}
}
