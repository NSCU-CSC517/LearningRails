class VideoFunctions
  def play_movie
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def stop_movie
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def delete_movie
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def movie_details
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def method_missing(m, *args, &block)
    puts "Unable to perform action #{m} on Movie object"
  end
end
