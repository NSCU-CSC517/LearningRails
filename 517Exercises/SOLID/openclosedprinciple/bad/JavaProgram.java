public class JavaProgram implements Program {

    @Override
    public String getCode() {
        return "System.out.println(\"hello world\");";
    }

    @Override
    public String getType() {
        return "Java";
    }

}
