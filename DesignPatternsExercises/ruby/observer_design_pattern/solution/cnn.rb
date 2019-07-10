require_relative 'observer'

class CNN < Observer
  def send_notification
    puts "CNN Breaking News: #{@breaking_news_feed.breaking_news}"
  end
end
