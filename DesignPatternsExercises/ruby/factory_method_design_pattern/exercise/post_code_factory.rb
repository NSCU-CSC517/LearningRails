require_relative 'us_post_code'
require_relative 'uk_post_code'
require_relative 'in_post_code'

class PostCodeFactory
  def __________(3)__________(country, post_code)
    return __________(4)__________(post_code) if country == :US
    return __________(5)__________(post_code) if country == :UK
    return __________(6)__________(post_code) if country == :IN

    raise NotImplementedError, 'Country is not supported'
  end
end
