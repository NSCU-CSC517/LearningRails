// public __________(5)__________ class Expression implements __________(6)__________ {
public abstract class Expression implements Statement {
	protected Constant firstConstant;
	protected Constant secondConstant;

	public Expression(Constant firstConstant, Constant secondConstant) {
		this.firstConstant = firstConstant;
		this.secondConstant = secondConstant;
	}
}
