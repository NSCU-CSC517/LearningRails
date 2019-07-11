require_relative 'statement'

class Expression < Statement
  # def __________(4)__________(first_constant, second_constant)
  def initialize(first_constant, second_constant)
    # __________(5)__________ = first_constant
    @first_constant = first_constant
    # __________(6)__________ = second_constant
    @second_constant = second_constant
  end

  def interpret
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
