public class Constant implements __________(1)__________ {
    private final String constant;

    public Constant(String constant) {
        this.constant = constant;
    }

    @Override
    public int interpret() {
        return __________(2)__________.parseInt(constant);
    }
}
