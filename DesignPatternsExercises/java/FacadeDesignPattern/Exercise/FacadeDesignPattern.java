public class FacadeDesignPattern {

	public static void main(String[] args) {
		System.out.println("Student ID: 2001 and Book: " + Constants.JAVA_BOOK);
		BookCheckoutFacade b1 = new BookCheckoutFacade(2001);
		b1.issueBook(Constants.JAVA_BOOK);

		System.out.println("Student ID: 2002 and Book: " + Constants.JAVA_BOOK);
		BookCheckoutFacade b2 = new BookCheckoutFacade(2002);
		b2.issueBook(Constants.JAVA_BOOK);

		System.out.println("Student ID: 1 and Book: " + Constants.DESIGN_BOOK);
		BookCheckoutFacade b3 = new BookCheckoutFacade(1);
		b3.issueBook(Constants.DESIGN_BOOK);
	}

}
