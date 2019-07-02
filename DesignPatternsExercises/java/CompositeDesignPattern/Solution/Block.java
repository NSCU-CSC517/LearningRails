public class Block implements Group {
	private int width;
	private int length;

    public Block(int width, int length) {
		this.width = width;
		this.length = length;
	}

	@Override
	// public void __________(5)__________() {
    public void assemble() {
        System.out.println("Adding a block with dimensions " + this.width + " x " + this.length);
    }
}
