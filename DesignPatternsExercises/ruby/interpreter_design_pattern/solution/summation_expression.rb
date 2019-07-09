require_relative 'expression'

class SummationExpression < Expression
  def initialize(first_constant, second_constant)
    # __________(15)__________(first_constant, second_constant)
    super(first_constant, second_constant)
  end

  def interpret
    # @first_constant.interpret __________(16)__________ @second_constant.interpret
    @first_constant.interpret + @second_constant.interpret
  end
end