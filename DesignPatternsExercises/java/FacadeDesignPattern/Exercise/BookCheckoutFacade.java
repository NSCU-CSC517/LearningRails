public class BookCheckoutFacade {

	private int studentId;
	private StudentAccountVerification studentAccountVerification;
	private BookAvailability bookAvailability;

	public BookCheckoutFacade(int studentId) {
		this.studentId = studentId;
		studentAccountVerification = __________(3)__________;
		bookAvailability = __________(4)__________;
	}

	public void __________(5)__________(String book) {
		if(studentAccountVerification.isStudentIdValid(studentId) && bookAvailability.isBookAvailable(book)) {
			bookAvailability.__________(6)__________(book);
		}
	}
}
