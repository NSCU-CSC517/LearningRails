require_relative 'post_code'

class USPostCode < PostCode
  # def __________(16)__________(post_code)
  def initialize(post_code)
    @post_code = post_code if is_valid_post_code(post_code)
    raise 'Invalid US post code' unless is_valid_post_code(post_code)

    puts "Creating instance of USPostCode: #{post_code}"
  end

  # def __________(17)__________(post_code)
  def is_valid_post_code(post_code)
    post_code =~ /^[0-9]{5}(?:-[0-9]{4})?$/
  end
end
