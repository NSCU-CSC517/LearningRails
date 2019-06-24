public class OpenClosedPrincipleBad {
    public static void main(String[] args) {

        ProgramRunner programRunner = new ProgramRunner();

        Program java = new JavaProgram();
        Program python = new PythonProgram();
        Program ruby = new RubyProgram();

        programRunner.runProgram(java);
        programRunner.runProgram(python);
        programRunner.runProgram(ruby);

    }
}
