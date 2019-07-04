// public class OakTree __________(3)__________  Tree {
public class OakTree extends Tree {
    private int rootDepth;
    private String forestType;

    public OakTree() {
        // __________(4)__________ (false, false, 70);
        super(false, false, 70);
        forestType = "Deciduous";
    }

    @Override
    public void changeProperty() {
        System.out.println("Changing Oak Tree property Forest Type to Evergreen\n");
        setForestType("Evergreen");
    }

    public int getRootDepth() {
        return rootDepth;
    }

    public void setRootDepth(int rootDepth) {
        this.rootDepth = rootDepth;
    }

    public String getForestType() {
        return forestType;
    }

    public void setForestType(String forestType) {
        this.forestType = forestType;
    }

    @Override
    public String toString() {
        return "Oak Tree ~~ Height: " + getHeight() + "  Flowers: " + hasFlowers() + "  Fruits: " + hasFruits() +
                "  Root Depth: " + getRootDepth() + "  Forest Type: " + getForestType();
    }
}
