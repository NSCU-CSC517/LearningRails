require_relative 'us_post_code'
require_relative 'uk_post_code'

class PostCodeFactory
  # def __________(11)__________(country, post_code)
  def instance(country, post_code)
    # return __________(12)__________(post_code) if country == :US
    return USPostCode.new(post_code) if country == :US
    # return __________(13)__________(post_code) if country == :UK
    return UKPostCode.new(post_code) if country == :UK

    raise 'Country is not supported'
  end
end
