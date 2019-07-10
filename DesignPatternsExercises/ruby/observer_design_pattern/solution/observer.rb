class Observer
  # def __________(4)__________(breaking_news_feed)
  def initialize(breaking_news_feed)
    # __________(5)__________ = breaking_news_feed
    @breaking_news_feed = breaking_news_feed
    # breaking_news_feed.subscribe(__________(6)__________)
    breaking_news_feed.subscribe(self)
  end

  def send_notification
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
