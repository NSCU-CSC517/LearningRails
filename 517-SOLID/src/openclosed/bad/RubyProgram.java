package openclosed.bad;

public class RubyProgram implements Program {

	@Override
	public String getCode() {
		return "puts \"hello world\"";
	}

	@Override
	public String getType() {
		return "Ruby";
	}

}
