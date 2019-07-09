public class SubtractionExpression extends Expression {

    public SubtractionExpression(Constant firstConstant, Constant secondConstant) {
        // __________(16)__________;
        super(firstConstant, secondConstant);
    }

    @Override
    public int interpret() {
        // return firstConstant.interpret() __________(17)__________ secondConstant.interpret();
        return firstConstant.interpret() - secondConstant.interpret();
    }
}
