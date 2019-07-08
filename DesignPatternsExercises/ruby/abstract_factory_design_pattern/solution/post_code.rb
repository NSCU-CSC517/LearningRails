class PostCode
  # def __________(7)__________(post_code)
  def initialize(post_code)
    valid_post_code?(post_code) ? (@post_code = post_code) : (raise 'Invalid UK post code')
  end

  def valid_post_code?(post_code)
    raise NotImplementedError, 'Subclass must override this method'
  end
end
