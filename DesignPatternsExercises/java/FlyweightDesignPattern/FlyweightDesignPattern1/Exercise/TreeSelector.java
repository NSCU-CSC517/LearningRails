import java.util.HashMap;
import java.util.Map;

public class TreeSelector {
    private final static Map<String, Tree> treeBySpec = new HashMap<>();

    public static Tree getTree(String treeType) {
        if (treeBySpec.containsKey(treeType))
            return treeBySpec.get(treeType);
        else {
            Tree tree = null;
            if (treeType.equals("Oak Tree")) {
                tree = new __________(8)__________ ();
                treeBySpec.put(treeType, tree);
            } else if (treeType.equals("Flowering Cherry")) {
                tree = new __________(9)__________ ();
                treeBySpec.put(treeType, tree);
            } else {
                System.out.println(treeType + " is not found");
            }
            return tree;
        }
    }
}
