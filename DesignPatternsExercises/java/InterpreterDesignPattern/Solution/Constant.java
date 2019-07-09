// public class Constant implements __________(1)__________ {
public class Constant implements Statement {
    private final String constant;

    public Constant(String constant) {
        this.constant = constant;
    }

    @Override
    public int interpret() {
        // return __________(2)__________.parseInt(constant);
        return Integer.parseInt(constant);
    }
}
