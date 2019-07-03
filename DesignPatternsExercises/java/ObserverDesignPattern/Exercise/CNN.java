public class CNN extends __________(3)__________ {

	public CNN(BreakingNewsFeed breakingNewsFeed) {
		__________(4)__________(breakingNewsFeed);
	}

	@Override
	public void sendNotification() {
		System.out.println("CNN Breaking News: " + breakingNewsFeed.getBreakingNews());
	}
}
