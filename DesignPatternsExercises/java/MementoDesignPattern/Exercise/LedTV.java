public class LedTV {
    private final int size;
    private final double price;

    public LedTV(int size, double price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LedTV:\n        size: " + size + ", price: $" + price;
    }
}
