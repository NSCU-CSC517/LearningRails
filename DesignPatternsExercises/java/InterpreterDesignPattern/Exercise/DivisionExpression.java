public class DivisionExpression extends Expression {
    public DivisionExpression(Constant firstConstant, Constant secondConstant) {
        __________(3)__________;
    }

    @Override
    public int interpret() {
        return firstConstant.interpret() __________(4)__________ secondConstant.interpret();
    }
}
