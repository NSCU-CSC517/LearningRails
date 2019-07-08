class PhoneNumber
  def __________(3)__________(phone_number)
    valid_phone_number?(phone_number) ? (@phone_number = phone_number) : (raise 'Invalid UK phone number')
  end

  def valid_phone_number?(phone_number)
    raise NotImplementedError, 'Subclass must override this method'
  end
end
