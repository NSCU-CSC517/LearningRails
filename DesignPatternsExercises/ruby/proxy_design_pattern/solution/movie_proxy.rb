require_relative 'movie'
require_relative 'video_functions'

class MovieProxy < VideoFunctions
  def initialize(name)
    # @movie = __________(2)__________
    @movie = Movie.new(name)
  end

  def play_movie
    # __________(3)__________
    @movie.play_movie
  end

  def stop_movie
    # __________(4)__________
    @movie.stop_movie
  end

  def delete_movie
    puts 'Deleting movie: Permission denied!!!'
  end

  def movie_details
    # __________(5)__________
    @movie.movie_details
  end
end
