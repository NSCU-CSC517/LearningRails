public class Speaker {
	private int wattage;

	public Speaker(int wattage) {
		this.wattage = wattage;
	}

	/** Getters and Setters for all the private data can be coded here */

	@Override
	 public String toString() {
		return "Speaker:\n        wattage: " + wattage;
	 }
}
