require_relative 'expression'

class SubtractionExpression < Expression
  def interpret
    @first_constant.interpret __________(13)__________ @second_constant.interpret
  end
end
