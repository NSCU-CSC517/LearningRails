public class USPhoneNumber implements PhoneNumber {
	private String __________(21)__________;

	public USPhoneNumber(String phoneNumber) {
		if(!__________(22)__________(phoneNumber))
			throw new IllegalArgumentException("Invalid US phone number");
		this.phoneNumber = phoneNumber;
	}
	@Override
	public boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$");
	}
	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
