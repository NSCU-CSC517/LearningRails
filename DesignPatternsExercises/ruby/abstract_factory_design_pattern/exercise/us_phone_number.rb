require_relative 'phone_number'

class USPhoneNumber < PhoneNumber
  def valid_phone_number?(phone_number)
    phone_number =~ /\(?[0-9]{3}\)? [0-9]{3}-[0-9]{4}$/
  end
end
