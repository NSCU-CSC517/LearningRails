require_relative 'video_functions'

class Movie < VideoFunctions
  def __________(1)__________
    @name = name
    @size = 1023
    @director = 'Christopher Nolan'
  end

  def play_movie
    puts "Playing movie: #{@name}"
  end

  def stop_movie
    puts "Stopping movie: #{@name}"
  end

  def delete_movie
    puts "Deleting movie: #{@name}"
  end

  def movie_details
    "Movie Details:\n    Name: #{@name}\n    Size: #{@size} MB\n    Director: #{@director}"
  end
end
