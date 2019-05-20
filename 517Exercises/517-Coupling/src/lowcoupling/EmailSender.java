package lowcoupling;

public class EmailSender {
	
	private boolean isValidSender(String address) {
		System.out.println("Validating Address...");
		return true;
	}
	
	private boolean isValidRecepient(String address) {
		System.out.println("Validating Recepient...");
		return true;
	}
	
	private boolean isValidHeader(String header) {
		System.out.println("Validating Header...");
		return true;
	}
	
	private boolean isValidBody(String body) {
		System.out.println("Validating Body...");
		return true;
	}
	
	private Email prepareEmail(Email email) {
		email.status = "Prepared To Send";
		return email;
	}
	
	private boolean sendPreparedEmail(Email email) {
		if (email.status == "Prepared To Send") {
			System.out.println("Sending Email: " + email.header);
			return true;
		} else {
			System.out.println("Failed to send Email: " + email.header);
			return false;
		}
	}
	
	public void sendEmail(String sender, String recepient, String header, String body) {
		boolean valid_sender = isValidSender(sender);
		boolean valid_recepient = isValidRecepient(recepient);
		boolean valid_header = isValidHeader(header);
		boolean valid_body = isValidBody(body);
		
		if ( valid_sender && valid_recepient && valid_header && valid_body ) {
			Email email = new Email (sender, recepient, header, body);
			email = prepareEmail(email);
			sendPreparedEmail(email);
		} else {
			System.out.println("Invalid Email!");
		}
	}
	
	
}
