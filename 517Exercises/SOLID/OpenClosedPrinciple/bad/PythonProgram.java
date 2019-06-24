public class PythonProgram implements Program {

    @Override
    public String getCode() {
        return "print \"hello world\"";
    }

    @Override
    public String getType() {
        return "Python";
    }

}
