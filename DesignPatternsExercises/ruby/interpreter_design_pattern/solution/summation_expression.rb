require_relative 'expression'

class SummationExpression < Expression
  def interpret
    # @first_constant.interpret __________(14)__________ @second_constant.interpret
    @first_constant.interpret + @second_constant.interpret
  end
end
