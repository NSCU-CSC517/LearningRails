public class Constant implements Expression {
    private String constant;

    public Constant(String constant) {
        this.constant = constant;
    }

    @Override
    public int interpret() {
        // return __________(1)__________.parseInt(constant);
        return Integer.parseInt(constant);
    }
}
