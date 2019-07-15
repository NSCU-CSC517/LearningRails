import java.util.HashMap;
import java.util.Map;

public class TreeSelector {
    private final static Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String treeType) {
        if (treeMap.containsKey(treeType))
            return treeMap.get(treeType);
        else {
            Tree tree = null;
            if (treeType.equals("Oak Tree")) {
                tree = __________(8)__________();
                treeMap.put(treeType, tree);
            } else if (treeType.equals("Flowering Cherry")) {
                tree = __________(9)__________();
                treeMap.put(treeType, tree);
            } else {
                throw new IllegalArgumentException(treeType + " is not found");
            }
            return tree;
        }
    }
}
