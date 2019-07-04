class InterpreterDesignPattern {
    public static void main(String[] args) {
    	ExpressionReader expressionReader = new ExpressionReader();
    	String expressionString = "50 + 50";
		Expression expression = expressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());

		expressionString = "100 - 3";
		expression = expressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());

		expressionString = "5 * 5";
		expression = expressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());

		expressionString = "9 / 3";
		expression = expressionReader.read(expressionString);
		System.out.println(expressionString + " = " + expression.interpret());
    }
}
