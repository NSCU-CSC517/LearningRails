import java.util.HashMap;
import java.util.Map;

public class BookAvailablityCheck {
	private static Map<String, Integer> bookMap ;
	static {
		bookMap = new HashMap<>();
		bookMap.put(Constants.JAVA_BOOK, 1);
		bookMap.put(Constants.DESIGN_BOOK, 3);
		bookMap.put(Constants.MISTAKES_BOOK, 7);
	}

	// public boolean __________(6)__________(String book) {
	public boolean isBookAvailable(String book) {
		// if(bookMap.containsKey(book) && bookMap.get(book) > __________(7)__________) {
		if(bookMap.containsKey(book) && bookMap.get(book) > 0) {
			System.out.println("The Book is available");
			return true;
		} else {
			System.out.println("Sorry, the book is not available");
			return false;
		}
	}

	// public void __________(8)__________(String book) {
	public void bookCheckout(String book) {
		bookMap.put(book, bookMap.get(book) - 1);
		System.out.println("You have 2 days to return it");
	}
}
