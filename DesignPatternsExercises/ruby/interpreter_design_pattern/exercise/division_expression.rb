require_relative 'expression'

class DivisionExpression < Expression
  def initialize(first_constant, second_constant)
    __________(2)__________(first_constant, second_constant)
  end

  def interpret
    @first_constant.interpret __________(3)__________ @second_constant.interpret
  end
end
