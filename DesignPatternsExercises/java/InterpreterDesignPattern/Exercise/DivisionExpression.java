public class DivisionExpression implements Expression {
    private Expression firstConstant;
    private Expression secondConstant;

    public DivisionExpression(Expression firstConstant, Expression secondConstant) {
        this.firstConstant = firstConstant;
        this.secondConstant = secondConstant;
    }

    @Override
    public int interpret() {
        return firstConstant.interpret() __________(2)__________ secondConstant.interpret();
    }
}
