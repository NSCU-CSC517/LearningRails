require_relative 'constant'
require_relative 'summation_expression'
require_relative 'subtraction_expression'
require_relative 'multiplication_expression'
require_relative 'division_expression'

class ExpressionReader
  # def __________(7)__________(expression)
  def self.read(expression)
    expression_token = expression.split(' ')
    first_constant = Constant.new(expression_token[Operators::FIRST_CONSTANT_INDEX])
    second_constant = Constant.new(expression_token[Operators::SECOND_CONSTANT_INDEX])

    # return __________(8)__________(first_constant, second_constant) if expression.include?(Operators::SUMMATION_OPERATOR.to_s)
    return SummationExpression.new(first_constant, second_constant) if expression.include?(Operators::SUMMATION_OPERATOR.to_s)
    # return __________(9)__________(first_constant, second_constant) if expression.include?(Operators::SUBTRACTION_OPERATOR.to_s)
    return SubtractionExpression.new(first_constant, second_constant) if expression.include?(Operators::SUBTRACTION_OPERATOR.to_s)
    # return __________(10)__________(first_constant, second_constant) if expression.include?(Operators::MULTIPLICATION_OPERATOR.to_s)
    return MultiplicationExpression.new(first_constant, second_constant) if expression.include?(Operators::MULTIPLICATION_OPERATOR.to_s)
    # return __________(11)__________(first_constant, second_constant) if expression.include?(Operators::DIVISION_OPERATOR.to_s)
    return DivisionExpression.new(first_constant, second_constant) if expression.include?(Operators::DIVISION_OPERATOR.to_s)

    nil
  end
end
