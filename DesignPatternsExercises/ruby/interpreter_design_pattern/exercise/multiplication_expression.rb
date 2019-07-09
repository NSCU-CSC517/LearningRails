require_relative 'expression'

class MultiplicationExpression < Expression
  def initialize(first_constant, second_constant)
    __________(11)__________(first_constant, second_constant)
  end

  def interpret
    @first_constant.interpret __________(12)__________ @second_constant.interpret
  end
end