require_relative 'phone_number_factory'
require_relative 'post_code_factory'

class AbstractFactory
  # def __________(1)__________(type)
  def self.factory(type)
    return PhoneNumberFactory.new if type == :Phone
    # return return __________(2)__________ if type == :Post
    return PostCodeFactory.new if type == :Post
  end
end
