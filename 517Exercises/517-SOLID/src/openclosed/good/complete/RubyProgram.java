package openclosed.good.complete;

public class RubyProgram implements Program {

	public String getCode() {
		return "puts \"hello world\"";
	}

	public String getType() {
		return "Ruby";
	}

	public void runProgram() {
		System.out.println("Running Ruby program...");	
	}

}
