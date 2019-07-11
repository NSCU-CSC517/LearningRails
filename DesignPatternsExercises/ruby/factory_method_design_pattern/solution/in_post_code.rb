require_relative 'post_code'

class INPostCode < PostCode
  def valid_post_code?(post_code)
    post_code =~ /[0-9]{6}/
  end
end
