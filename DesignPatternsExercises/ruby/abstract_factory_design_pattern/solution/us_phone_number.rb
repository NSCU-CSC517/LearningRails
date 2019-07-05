require_relative 'phone_number'

class USPhoneNumber < PhoneNumber
  # def __________(14)__________(phone_number)
  def initialize(phone_number)
    @phone_number = phone_number if is_valid_phone_number(phone_number)
    raise 'Invalid US phone number' unless is_valid_phone_number(phone_number)

    puts "Creating instance of USPhoneNumber: #{phone_number}"
  end

  # def __________(15)__________(phone_number)
  def is_valid_phone_number(phone_number)
    phone_number =~ /\(?[0-9]{3}\)? [0-9]{3}-[0-9]{4}$/
  end
end
