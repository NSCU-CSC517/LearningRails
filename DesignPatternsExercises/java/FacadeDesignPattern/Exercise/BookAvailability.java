import java.util.HashMap;
import java.util.Map;

public class BookAvailability {
	private static Map<String, Integer> bookMap ;
	static {
		bookMap = new HashMap<>();
		bookMap.put(Constants.JAVA_BOOK, 1);
		bookMap.put(Constants.DESIGN_BOOK, 3);
		bookMap.put(Constants.MISTAKES_BOOK, 7);
	}

	public boolean __________(1)__________(String book) {
		if(bookMap.containsKey(book) && bookMap.get(book) > __________(2)__________) {
			System.out.println(book + " is available");
			return true;
		} else {
			System.out.println("Sorry, " + book + " is not available");
			return false;
		}
	}

	public void bookCheckout(String book) {
		bookMap.put(book, bookMap.get(book) - 1);
		System.out.println("You have 2 days to return it");
	}
}
