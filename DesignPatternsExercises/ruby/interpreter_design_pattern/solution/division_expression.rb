require_relative 'expression'

class DivisionExpression < Expression
  def interpret
    # @first_constant.interpret __________(3)__________ @second_constant.interpret
    @first_constant.interpret / @second_constant.interpret
  end
end
