import java.util.ArrayList;
import java.util.List;

public class FlyweightDesignPattern1 {
    public static void main(String[] args) {
        List<Tree> treeList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            OakTree oakTree = (OakTree) TreeSelector.getTree("Oak Tree");
            oakTree.setRootDepth(i);
            treeList.add(oakTree);
        }

        for (int i = 0; i < 3; i++) {
            FloweringCherry floweringCherry = (FloweringCherry) TreeSelector.getTree("Flowering Cherry");
            treeList.add(floweringCherry);
        }

        for (Tree tree : treeList)
            System.out.println(tree);

        System.out.println("\nChanging property of a single Tree instance from the list at index 0");
        treeList.get(0).changeProperty();

        for (Tree tree : treeList)
            System.out.println(tree);
    }
}
