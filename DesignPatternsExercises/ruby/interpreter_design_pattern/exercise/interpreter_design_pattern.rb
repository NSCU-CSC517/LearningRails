require_relative 'expression_reader'

module Operators
  FIRST_CONSTANT_INDEX = 0
  SECOND_CONSTANT_INDEX = 2
  SUMMATION_OPERATOR = :+
  SUBTRACTION_OPERATOR = :-
  MULTIPLICATION_OPERATOR = :*
  DIVISION_OPERATOR = :/
end

expression_string = '50 + 50'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"

expression_string = '100 - 3'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"

expression_string = '5 * 5'
expression = ExpressionReader.read(expression_string);
puts "#{expression_string} = #{expression.interpret}"

expression_string = '9 / 3'
expression = ExpressionReader.read(expression_string)
puts "#{expression_string} = #{expression.interpret}"
