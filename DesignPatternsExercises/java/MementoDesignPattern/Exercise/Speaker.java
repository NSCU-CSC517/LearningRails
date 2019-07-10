public class Speaker {
    private int wattage;

    public Speaker(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Speaker:\n        wattage: " + wattage;
    }
}
