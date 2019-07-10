class BreakingNewsFeed
  attr_reader __________(1)__________

  def initialize
    @observers = []
  end

  def breaking_news=(breaking_news)
    @breaking_news = breaking_news
    __________(2)__________
  end

  def subscribe(observer)
    @observers << observer
  end

  private

  def notify_subscribers
    __________(3)__________.each(&:send_notification)
  end
end
