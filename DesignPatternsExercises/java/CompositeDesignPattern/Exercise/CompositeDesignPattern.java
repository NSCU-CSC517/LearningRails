public class CompositeDesignPattern {
	public static void main(String[] args) {
		Block block1 = new Block(1,2);
		Block block2 = new Block(3,4);
		Block block3 = new Block(5,6);

		Structure parentStructure = new Structure("parent");
		Structure childStructure1 = new Structure("child1");
		Structure childStructure2 = new Structure("child2");

		childStructure1.add(block1);
		childStructure1.add(block2);
		childStructure2.add(block3);

		parentStructure.add(childStructure1);
		parentStructure.add(childStructure2);
		// parentStructure.__________(1)__________();
		parentStructure.assemble();
	}
}
