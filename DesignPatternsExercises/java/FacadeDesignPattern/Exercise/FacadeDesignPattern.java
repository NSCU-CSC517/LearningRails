public class FacadeDesignPattern {
	public static void main(String[] args) {
		System.out.println("Student ID: 2001 and Book: " + Constants.JAVA_BOOK);
		BookCheckoutFacade bookCheckoutFacade = new BookCheckoutFacade(2001);
		bookCheckoutFacade.issueBook(Constants.JAVA_BOOK);
		System.out.println();

		System.out.println("Student ID: 2002 and Book: " + Constants.JAVA_BOOK);
		bookCheckoutFacade = new BookCheckoutFacade(2002);
		bookCheckoutFacade.issueBook(Constants.JAVA_BOOK);
		System.out.println();

		System.out.println("Student ID: 1 and Book: " + Constants.DESIGN_BOOK);
		bookCheckoutFacade = new BookCheckoutFacade(1);
		bookCheckoutFacade.issueBook(Constants.DESIGN_BOOK);
	}
}
