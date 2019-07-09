class InterpreterDesignPattern {
    public static void main(String[] args) {
    	String expressionString = "50 + 50";
		Expression expression = ExpressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());

		expressionString = "100 - 3";
		expression = ExpressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());

		expressionString = "5 * 5";
		expression = ExpressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());

		expressionString = "9 / 3";
		expression = ExpressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());
    }
}
