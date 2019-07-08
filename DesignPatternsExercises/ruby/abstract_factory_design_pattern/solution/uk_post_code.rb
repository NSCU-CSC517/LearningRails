require_relative 'post_code'

class UKPostCode < PostCode
  def initialize(post_code)
    # __________(13)__________(post_code)
    super(post_code)
    puts "Creating instance of UKPostCode: #{post_code}"
  end

  # def __________(14)__________(post_code)
  def valid_post_code?(post_code)
    post_code =~ /^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) [0-9][ABD-HJLNP-UW-Z]{2})/
  end
end
