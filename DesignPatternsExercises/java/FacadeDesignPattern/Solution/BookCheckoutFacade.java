public class BookCheckoutFacade {

	private int studentId;
	private StudentAccountVerification studentAccountVerification;
	private BookAvailability bookAvailability;

	public BookCheckoutFacade(int studentId) {
		this.studentId = studentId;
		// studentAccountVerification = __________(3)__________;
		studentAccountVerification = new StudentAccountVerification();
		// bookAvailability = __________(4)__________;
		bookAvailability = new BookAvailability();
	}

	// public void __________(5)__________(String book) {
	public void issueBook(String book) {
		if(studentAccountVerification.isStudentIdValid(studentId) && bookAvailability.isBookAvailable(book)) {
			// bookAvailability.__________(6)__________(book);
			bookAvailability.bookCheckout(book);
		}
	}
}
