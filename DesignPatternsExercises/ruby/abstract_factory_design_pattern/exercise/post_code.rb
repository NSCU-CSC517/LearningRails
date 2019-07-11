class PostCode
  attr_reader __________(9)__________

  def __________(10)__________
    if valid_post_code?(post_code)
      @post_code = post_code
      puts "Instantiated PostCode with #{@post_code}"
    else
      raise 'Invalid Post Code'
    end
  end

  def valid_post_code?(post_code)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
