public class BookCheckoutFacade {

	private int studentId;
	StudentAccountCheck acctCheck;
	BookAvailablityCheck bookCheck;

	public BookCheckoutFacade(int studentId) {
		this.studentId = studentId;
		acctCheck = __________(1)__________;
		bookCheck = __________(2)__________;
	}

	public void __________(3)__________(String book) {
		if(acctCheck.isStudentIdValid(studentId) && bookCheck.isBookAvailable(book)) {
			__________(4)__________;
		}
	}
}
