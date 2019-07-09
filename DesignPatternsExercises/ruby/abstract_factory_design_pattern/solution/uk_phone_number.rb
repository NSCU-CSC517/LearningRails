require_relative 'phone_number'

class UKPhoneNumber < PhoneNumber
  def initialize(phone_number)
    # __________(11)__________(phone_number)
    super(phone_number)
    puts "Creating instance of UKPhoneNumber: #{phone_number}"
  end

  # def __________(12)__________(phone_number)
  def valid_phone_number?(phone_number)
    phone_number =~ /^(?:(?:\(?(?:0(?:0|11)\)?[\s-]?\(?|\+)44\)?[\s-]?(?:\(?0\)?[\s-]?)?)|(?:\(?0))(?:(?:\d{5}\)?[\s-]?\d{4,5})|(?:\d{4}\)?[\s-]?(?:\d{5}|\d{3}[\s-]?\d{3}))|(?:\d{3}\)?[\s-]?\d{3}[\s-]?\d{3,4})|(?:\d{2}\)?[\s-]?\d{4}[\s-]?\d{4}))(?:[\s-]?(?:x|ext\.?|\#)\d{3,4})?$/
  end
end
