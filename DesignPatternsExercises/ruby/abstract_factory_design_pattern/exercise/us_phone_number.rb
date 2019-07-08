require_relative 'phone_number'

class USPhoneNumber < PhoneNumber
  def initialize(phone_number)
    __________(15)__________(phone_number)
    puts "Creating instance of USPhoneNumber: #{phone_number}"
  end

  def __________(16)__________(phone_number)
    phone_number =~ /\(?[0-9]{3}\)? [0-9]{3}-[0-9]{4}$/
  end
end
