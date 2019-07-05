require_relative 'post_code'

class UKPostCode < PostCode
  # def __________(12)__________(post_code)
  def initialize(post_code)
    @post_code = post_code if is_valid_post_code(post_code)
    raise 'Invalid UK post code' unless is_valid_post_code(post_code)

    puts "Creating instance of UKPostCode: #{post_code}"
  end

  # def __________(13)__________(post_code)
  def is_valid_post_code(post_code)
    post_code =~ /^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) [0-9][ABD-HJLNP-UW-Z]{2})/
  end
end
