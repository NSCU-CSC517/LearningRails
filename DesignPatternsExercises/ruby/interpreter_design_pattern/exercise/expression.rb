class Expression
  def initialize(first_constant, second_constant)
    __________(4)__________ = first_constant
    __________(5)__________ = second_constant
  end

  def interpret
    raise NotImplementedError, 'Subclass must override this method'
  end
end
