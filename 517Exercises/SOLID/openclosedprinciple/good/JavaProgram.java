// public class JavaProgram implements __________(7)__________ {
public class JavaProgram implements Program {

    public String getCode() {
        return "System.out.println(\"hello world\");";
    }

    public String getType() {
        return "Java";
    }

    // public void __________(8)__________() {
    public void runProgram() {
        System.out.println("Running Java program: " + getCode());
    }

}
