require_relative 'expression'

class MultiplicationExpression < Expression
  def interpret
    @first_constant.interpret __________(12)__________ @second_constant.interpret
  end
end
