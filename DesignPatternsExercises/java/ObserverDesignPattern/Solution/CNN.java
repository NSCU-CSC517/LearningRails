public class CNN extends Observer {
    public CNN(BreakingNewsFeed breakingNewsFeed) {
        // __________(4)__________(breakingNewsFeed);
        super(breakingNewsFeed);
    }

    @Override
    public void sendNotification() {
        System.out.println("CNN Breaking News: " + breakingNewsFeed.getBreakingNews());
    }
}
