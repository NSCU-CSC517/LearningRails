public class BookCheckoutFacade {

	private int studentId;
	StudentAccountCheck acctCheck;
	BookAvailablityCheck bookCheck;

	public BookCheckoutFacade(int studentId) {
		this.studentId = studentId;
		// acctCheck = __________(1)__________;
		acctCheck = new StudentAccountCheck();
		// bookCheck = __________(2)__________;
		bookCheck = new BookAvailablityCheck();
	}

	// public void __________(3)__________(String book) {
	public void issueBook(String book) {
		if(acctCheck.isStudentIdValid(studentId) && bookCheck.isBookAvailable(book)) {
			// __________(4)__________;
			bookCheck.bookCheckout(book);
		}
	}
}
