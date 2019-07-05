require_relative 'phone_number'

class UKPhoneNumber < PhoneNumber
  # def __________(10)__________(phone_number)
  def initialize(phone_number)
    @phone_number = phone_number if is_valid_phone_number(phone_number)
    raise 'Invalid UK phone number' unless is_valid_phone_number(phone_number)

    puts "Creating instance of UKPhoneNumber: #{phone_number}"
  end

  # def __________(11)__________(phone_number)
  def is_valid_phone_number(phone_number)
    phone_number =~ /^(?:(?:\(?(?:0(?:0|11)\)?[\s-]?\(?|\+)44\)?[\s-]?(?:\(?0\)?[\s-]?)?)|(?:\(?0))(?:(?:\d{5}\)?[\s-]?\d{4,5})|(?:\d{4}\)?[\s-]?(?:\d{5}|\d{3}[\s-]?\d{3}))|(?:\d{3}\)?[\s-]?\d{3}[\s-]?\d{3,4})|(?:\d{2}\)?[\s-]?\d{4}[\s-]?\d{4}))(?:[\s-]?(?:x|ext\.?|\#)\d{3,4})?$/
  end
end
