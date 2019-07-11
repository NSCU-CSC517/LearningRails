require_relative 'post_code'

class USPostCode < PostCode
  def valid_post_code?(post_code)
    post_code =~ /^[0-9]{5}(?:-[0-9]{4})?$/
  end
end
