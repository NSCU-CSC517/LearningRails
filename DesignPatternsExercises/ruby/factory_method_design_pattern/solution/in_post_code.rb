require_relative 'post_code'

class INPostCode < PostCode
  def initialize(post_code)
    super(post_code)
    puts 'Creating instance of INPostCode:'
  end

  def valid_post_code?(post_code)
    post_code =~ /[0-9]{6}/
  end
end
