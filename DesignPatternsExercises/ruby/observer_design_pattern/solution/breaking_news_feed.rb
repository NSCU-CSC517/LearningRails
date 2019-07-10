class BreakingNewsFeed
  # attr_reader __________(1)__________
  attr_reader :breaking_news

  def initialize
    @observers = []
  end

  def breaking_news=(breaking_news)
    @breaking_news = breaking_news
    # __________(2)__________
    notify_subscribers
  end

  def subscribe(observer)
    @observers << observer
  end

  private

  def notify_subscribers
    # __________(3)__________.each(&:send_notification)
    @observers.each(&:send_notification)
  end
end
