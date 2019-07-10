public class Seller {
	private String name;
	private String currency;
	private int sellingPrice;

	public Seller(String name, Mediator mediator, String currency, int sellingPrice) {
		this.name = name;
		this.currency = currency;
		this.sellingPrice = sellingPrice;
		mediator.__________(6)__________;
	}

	public String getCurrency() {
		return currency;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public boolean __________(7)__________(float bidInDollars) {
		if (bidInDollars <= sellingPrice) {
			System.out.println("Seller " + name + " accepts the bid of USD " + bidInDollars);
			sellingPrice = 0;
			return true;
		} else {
			System.out.println("Seller " + name + " rejects the bid of USD " + bidInDollars);
			return false;
		}
	}
}
