require_relative 'observer'

class NBCNews < Observer
  def send_notification
    puts "NBC Breaking News: #{@breaking_news_feed.breaking_news}"
  end
end
