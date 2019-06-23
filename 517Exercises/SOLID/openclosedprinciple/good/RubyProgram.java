// public class RubyProgram implements __________(5)__________ {
public class RubyProgram implements Program {

	/** public String __________(6)__________() {
		return "puts \'hello world\'";
	} */
	public String getCode() {
		return "puts \'hello world\'";
	}

	public String getType() {
		return "Ruby";
	}

	public void runProgram() {
		System.out.println("Running Ruby program: " + getCode());
	}

}
