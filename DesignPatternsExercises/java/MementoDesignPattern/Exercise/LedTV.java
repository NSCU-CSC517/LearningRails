public class LedTV {
	 private String  size;
	 private String  price;

	 public LedTV(String size, String price) {
		this.size = size;
		this.price = price;
	}

	/** Getters and Setters for all the private data can be coded here */

	@Override
	 public String toString() {
	 return "LedTV:\n        size: " + size + ", price: $" + price;
	 }
}
