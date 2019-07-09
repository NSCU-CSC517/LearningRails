require_relative 'us_phone_number'
require_relative 'uk_phone_number'

class PhoneNumberFactory
  # def __________(4)__________(country, phone_number)
  def instance(country, phone_number)
    # return __________(5)__________.new(phone_number) if country == :US
    return USPhoneNumber.new(phone_number) if country == :US
    # return __________(6)__________.new(phone_number) if country == :UK
    return UKPhoneNumber.new(phone_number) if country == :UK

    raise 'Country is not supported'
  end
end
