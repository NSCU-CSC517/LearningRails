public class Buyer {
	private Mediator mediator;
	private String currency;

	public Buyer(Mediator mediator, String currency) {
		this.mediator = mediator;
		this.currency = currency;
		// mediator.__________(1)__________;
		mediator.addBuyer(this);
	}

	// public void __________(2)__________(float bid) {
	public void attemptToPurchase(float bid) {
		System.out.println("Buyer is attempting a bid of " + currency + " " + bid);
		mediator.placeBid(currency, bid);
	}
}
