public class ProgramRunner {

    public void runProgram(Program p) {
        if (p.getType().equals("Ruby"))
            runRubyProgram(p.getCode());
        else if (p.getType().equals("Python"))
            runPythonProgram(p.getCode());
        else if (p.getType().equals("Java"))
            runJavaProgram(p.getCode());
    }

    private void runRubyProgram(String code) {
        System.out.println("Running Ruby Code: " + code);
    }
    private void runPythonProgram(String code) {
        System.out.println("Running Python Code: " + code);
    }
    private void runJavaProgram(String code) {
        System.out.println("Running Java Code: " + code);
    }
}
