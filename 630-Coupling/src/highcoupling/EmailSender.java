package highcoupling;

public class EmailSender {
	
	public boolean isValidSender(String address) {
		System.out.println("Validating Address...");
		return true;
	}
	
	public boolean isValidRecepient(String address) {
		System.out.println("Validating Recepient...");
		return true;
	}
	
	public boolean isValidHeader(String header) {
		System.out.println("Validating Header...");
		return true;
	}
	
	public boolean isValidBody(String body) {
		System.out.println("Validating Body...");
		return true;
	}
	
	public Email prepareEmail(Email email) {
		email.status = "Prepared To Send";
		return email;
	}
	
	public boolean sendEmail(Email email) {
		if (email.status == "Prepared To Send") {
			System.out.println("Sending Email: " + email.header);
			return true;
		} else {
			System.out.println("Failed to send Email: " + email.header);
			return false;
		}
	}
	
	
}
