public class OpenClosedPrincipleGood {
    public static void main(String[] args) {

        Program java = new JavaProgram();
        Program python = new PythonProgram();
        Program ruby = new RubyProgram();

        java.runProgram();
        python.runProgram();
        ruby.runProgram();

    }
}
