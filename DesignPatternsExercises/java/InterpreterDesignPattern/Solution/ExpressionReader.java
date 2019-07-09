public class ExpressionReader {
	// public __________(7)__________ Expression read(String expression) {
	public static Expression read(String expression) {
		String[] expressionToken = expression.split("\\s+");
		Constant firstConstant = new Constant(expressionToken[Statement.FIRST_CONSTANT_INDEX]);
		Constant secondConstant = new Constant(expressionToken[Statement.SECOND_CONSTANT_INDEX]);

		if (expression.contains(Statement.SUMMATION_OPERATOR))
			// return new __________(8)__________(firstConstant, secondConstant);
			return new SummationExpression(firstConstant, secondConstant);
		else if (expression.contains(Statement.SUBTRACTION_OPERATOR))
			// return new __________(9)__________(firstConstant, secondConstant);
			return new SubtractionExpression(firstConstant, secondConstant);
		else if (expression.contains(Statement.MULTIPLICATION_OPERATOR))
			// return new __________(10)__________(firstConstant, secondConstant);
			return new MultiplicationExpression(firstConstant, secondConstant);
		else if (expression.contains(Statement.DIVISION_OPERATOR))
			// return new __________(11)__________(firstConstant, secondConstant);
			return new DivisionExpression(firstConstant, secondConstant);
		return null;
	}
}
