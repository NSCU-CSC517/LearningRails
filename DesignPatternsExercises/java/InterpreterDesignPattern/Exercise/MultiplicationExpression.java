public class MultiplicationExpression implements Expression {
    private Expression firstConstant;
    private Expression secondConstant;

    public MultiplicationExpression(Expression firstConstant, Expression secondConstant) {
        this.firstConstant = firstConstant;
        this.secondConstant = secondConstant;
    }

    @Override
    public int interpret() {
        return firstConstant.interpret() __________(9)__________ secondConstant.interpret();
    }
}
