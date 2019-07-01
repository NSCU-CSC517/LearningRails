public class UKPhoneNumber implements PhoneNumber {
	// private String __________(19)__________;
	private String phoneNumber;

	public UKPhoneNumber(String phoneNumber) {
		// if(!__________(20)__________(phoneNumber))
		if(!isValidPhoneNumber(phoneNumber))
			throw new IllegalArgumentException("Invalid UK phone number");
		this.phoneNumber = phoneNumber;
	}
	@Override
	public boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^(?:(?:\\(?(?:0(?:0|11)\\)?[\\s-]?\\(?|\\+)44\\)?"
				+ "[\\s-]?(?:\\(?0\\)?[\\s-]?)?)|(?:\\(?0))(?:(?:\\d{5}\\)?[\\s-]?\\d"
				+ "{4,5})|(?:\\d{4}\\)?[\\s-]?(?:\\d{5}|\\d{3}[\\s-]?\\d{3}))|(?:\\d{3}"
				+ "\\)?[\\s-]?\\d{3}[\\s-]?\\d{3,4})|(?:\\d{2}\\)?[\\s-]?\\d{4}[\\s-]?\\"
				+ "d{4}))(?:[\\s-]?(?:x|ext\\.?|\\#)\\d{3,4})?$");
	}
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
