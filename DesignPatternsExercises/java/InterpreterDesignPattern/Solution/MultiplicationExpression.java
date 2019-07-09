public class MultiplicationExpression extends Expression {

    public MultiplicationExpression(Constant firstConstant, Constant secondConstant) {
        // __________(12)__________;
        super(firstConstant, secondConstant);
    }

    @Override
    public int interpret() {
        // return firstConstant.interpret() __________(13)__________ secondConstant.interpret();
        return firstConstant.interpret() * secondConstant.interpret();
    }
}
