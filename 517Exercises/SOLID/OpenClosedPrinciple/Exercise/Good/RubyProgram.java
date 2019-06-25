public class RubyProgram implements __________(5)__________ {

	public String __________(6)__________() {
		return "puts \'hello world\'";
	}

	public String getType() {
		return "Ruby";
	}

	public void runProgram() {
		System.out.println("Running Ruby program: " + getCode());
	}

}
