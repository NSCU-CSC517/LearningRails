// public class PythonProgram implements __________(3)__________ {
public class PythonProgram implements Program {

	public String getCode() {
		return "print \"hello world\"";
	}

	public String getType() {
		return "Python";
	}

	/** public void __________(4)__________ {
		System.out.println("Running Python program: " + getCode());
	} */
	public void runProgram() {
		System.out.println("Running Python program: " + getCode());
	}

}
