class PostCode
  attr_reader __________(1)__________

  def __________(2)__________(post_code)
    valid_post_code?(post_code) ? (@post_code = post_code) : (raise 'Invalid post code')
  end

  def valid_post_code?(post_code)
    raise NotImplementedError, 'Subclass must override this method'
  end
end
