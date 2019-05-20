package openclosed.good.complete;

public class PythonProgram implements Program {

	public String getCode() {
		return "print \"hello world\"";
	}

	public String getType() {
		return "Python";
	}

	public void runProgram() {
		System.out.println("Running Python program...");
	}

}
