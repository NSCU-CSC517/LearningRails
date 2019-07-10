require_relative 'breaking_news_feed'
require_relative 'cnn'
require_relative 'fox_news'
require_relative 'nbc_news'

breaking_news_feed = BreakingNewsFeed.new

CNN.new(breaking_news_feed)
FoxNews.new(breaking_news_feed)

breaking_news_feed.breaking_news = 'UK votes to leave EU'
puts ''

NBCNews.new(breaking_news_feed)
breaking_news_feed.breaking_news = 'Dow Jones set new record'
