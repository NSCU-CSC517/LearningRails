require_relative 'movie_proxy'

movie_proxy = MovieProxy.new('The Prestige')
puts movie_proxy.movie_details
movie_proxy.play_movie
movie_proxy.stop_movie
movie_proxy.delete_movie
movie_proxy.record_movie
