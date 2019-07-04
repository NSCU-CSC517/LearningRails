public class SubtractionExpression implements Expression {
    private Expression firstConstant;
    private Expression secondConstant;

    public SubtractionExpression(Expression firstConstant, Expression secondConstant) {
        this.firstConstant = firstConstant;
        this.secondConstant = secondConstant;
    }

    @Override
    public int interpret() {
        return firstConstant.interpret() __________(10)__________ secondConstant.interpret();
    }
}
