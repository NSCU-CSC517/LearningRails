public class ObserverDesignPattern {
	public static void main(String[] args) {
		BreakingNewsFeed breakingNewsFeed = new BreakingNewsFeed();

		new CNN(breakingNewsFeed);
		new FoxNews(breakingNewsFeed);

		breakingNewsFeed.setBreakingNews("UK votes to leave EU");
		System.out.println();

		new NBCNews(breakingNewsFeed);
		breakingNewsFeed.setBreakingNews("Dow Jones set new record");
	}
}
