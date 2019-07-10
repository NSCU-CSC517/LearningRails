require_relative 'observer'

class FoxNews < Observer
  def send_notification
    puts "Fox Alert: #{@breaking_news_feed.breaking_news}"
  end
end
