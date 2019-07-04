public class FloweringCherry __________(1)__________ Tree {
    private String flowerColor;

    public FloweringCherry() {
        __________(2)__________ (true, false, 20);
        flowerColor = "Pink";
    }

    @Override
    public void changeProperty() {
        System.out.println("Changing Flowering Cherry property Flower Color to Violet\n");
        setFlowerColor("Violet");
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    @Override
    public String toString() {
        return "Flowering Cherry ~~ Height: " + getHeight() + "  Flowers: " + hasFlowers() +
                "  Fruits: " + hasFruits() + "  Flower Color: " + getFlowerColor();
    }
}
