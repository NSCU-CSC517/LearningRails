public class CompositeDesignPattern {
	public static void main(String[] args) {
		Block block1 = new Block(1,2);
		Block block2 = new Block(3,4);
		Block block3 = new Block(5,6);

		Structure structure1 = new Structure("1");
		Structure structure2 = new Structure("2");
		Structure structure3 = new Structure("3");

		structure2.add(block1);
		structure2.add(block2);
		structure3.add(block3);

		structure1.add(structure2);
		structure1.add(structure3);
		// structure1.__________(1)__________();
		structure1.assemble();
	}
}
