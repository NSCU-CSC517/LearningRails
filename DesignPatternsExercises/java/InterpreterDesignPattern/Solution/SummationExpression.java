public class SummationExpression implements Expression {
    private Expression firstConstant;
    private Expression secondConstant;

    public SummationExpression(Expression firstConstant, Expression secondConstant) {
        this.firstConstant = firstConstant;
        this.secondConstant = secondConstant;
    }

    @Override
	public int interpret() {
        // return firstConstant.interpret() __________(11)__________ secondConstant.interpret();
		return firstConstant.interpret() + secondConstant.interpret();
	}
}
