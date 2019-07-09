public class SummationExpression extends Expression {

    public SummationExpression(Constant firstConstant, Constant secondConstant) {
        // __________(18)__________;
        super(firstConstant, secondConstant);
    }

    @Override
	public int interpret() {
        // return firstConstant.interpret() __________(19)__________ secondConstant.interpret();
		return firstConstant.interpret() + secondConstant.interpret();
	}
}
