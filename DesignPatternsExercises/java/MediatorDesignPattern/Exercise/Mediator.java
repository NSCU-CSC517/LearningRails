import java.util.ArrayList;

public class Mediator {
	private ArrayList<Buyer> buyersList = new ArrayList<>();
	private ArrayList<Seller> sellersList = new ArrayList<>();

	public void addSeller(Seller seller) {
		sellersList.add(seller);
	}

	public void addBuyer(Buyer buyer) {
		buyersList.add(buyer);
	}

	// public void __________(4)__________(String currency, float bid) {
	public void placeBid(String currency, float bid) {
		ArrayList<Seller> sellers = new ArrayList<>();
		for (Seller seller : sellersList) {
			if (seller.getCurrency().equals(currency) && seller.getSellingPrice() > 0) {
				sellers.add(seller);
			}
		}
		if (sellers.isEmpty()) {
			System.out.println("Seller is not found for " + bid + " " + currency);
		} else {
			// float dollarAmount = CurrencyConverter.__________(5)__________(currency, bid);
			float dollarAmount = CurrencyConverter.convert(currency, bid);
			for (Seller seller : sellers) {
				if (seller.isBidAccepted(dollarAmount))
					return;
			}
		}
	}
}
