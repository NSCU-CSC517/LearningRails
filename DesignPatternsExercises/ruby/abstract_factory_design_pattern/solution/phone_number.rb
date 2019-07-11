class PhoneNumber
  # attr_reader __________(4)__________
  attr_reader :phone_number

  # def __________(5)__________
  def initialize(phone_number)
    if valid_phone_number?(phone_number)
      @phone_number = phone_number
      puts "Instantiated PhoneNumber with #{@phone_number}"
    else
      raise 'Invalid Phone Number'
    end
  end

  def valid_phone_number?(phone_number)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
