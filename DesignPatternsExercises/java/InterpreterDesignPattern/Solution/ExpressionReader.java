public class ExpressionReader {
	public Expression read(String expression) {
		try {
			String[] expressionToken = expression.split("\\s+");
			Constant firstConstant = new Constant(expressionToken[Expression.FIRST_CONSTANT_INDEX]);
			Constant secondConstant = new Constant(expressionToken[Expression.SECOND_CONSTANT_INDEX]);

			if (expression.contains(Expression.SUMMATION_OPERATOR))
				// return new __________(5)__________(firstConstant, secondConstant);
				return new SummationExpression(firstConstant, secondConstant);
			else if (expression.contains(Expression.SUBTRACTION_OPERATOR))
				// return new __________(6)__________(firstConstant, secondConstant);
				return new SubtractionExpression(firstConstant, secondConstant);
			else if (expression.contains(Expression.MULTIPLICATION_OPERATOR))
				// return new __________(7)__________(firstConstant, secondConstant);
				return new MultiplicationExpression(firstConstant, secondConstant);
			else if (expression.contains(Expression.DIVISION_OPERATOR))
				// return new __________(8)__________(firstConstant, secondConstant);
				return new DivisionExpression(firstConstant, secondConstant);
			return null;
		} catch (Exception exception) {
			System.out.println(exception);
			return null;
		}
	}
}
