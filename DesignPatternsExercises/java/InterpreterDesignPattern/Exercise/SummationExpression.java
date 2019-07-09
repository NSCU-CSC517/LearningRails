public class SummationExpression extends Expression {

    public SummationExpression(Constant firstConstant, Constant secondConstant) {
        __________(18)__________;
    }

    @Override
	public int interpret() {
        return firstConstant.interpret() __________(19)__________ secondConstant.interpret();
	}
}
