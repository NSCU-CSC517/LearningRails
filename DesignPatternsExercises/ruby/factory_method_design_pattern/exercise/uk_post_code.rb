require_relative 'post_code'

class UKPostCode < PostCode
  def initialize(post_code)
    super(post_code)
    puts 'Creating instance of UKPostCode:'
  end

  def valid_post_code?(post_code)
    post_code =~ /^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) [0-9][ABD-HJLNP-UW-Z]{2})/
  end
end
