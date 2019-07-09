require_relative 'post_code'

class USPostCode < PostCode
  def initialize(post_code)
    super(post_code)
    puts 'Creating instance of USPostCode:'
  end

  def valid_post_code?(post_code)
    post_code =~ /^[0-9]{5}(?:-[0-9]{4})?$/
  end
end
