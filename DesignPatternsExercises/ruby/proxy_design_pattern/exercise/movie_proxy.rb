require_relative 'movie'
require_relative 'video_functions'

class MovieProxy < VideoFunctions
  def initialize(name)
    @movie = __________(2)__________
  end

  def play_movie
    __________(3)__________
  end

  def stop_movie
    __________(4)__________
  end

  def delete_movie
    puts 'Deleting movie: Permission denied!!!'
  end

  def movie_details
    __________(5)__________
  end
end
