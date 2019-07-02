public class EmailSender {

	private boolean isValidSender(String address) {
		System.out.println("Validating Address...");
		return true;
	}

	private boolean isValidRecipient(String address) {
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
		email.setStatus("Prepared To Send");
		return email;
	}

	private boolean sendEmail(Email email) {
		if (email.getStatus() == "Prepared To Send") {
			System.out.println("Sending Email: " + email.getHeader());
			return true;
		} else {
			System.out.println("Failed to send Email: " + email.getHeader());
			return false;
		}
	}

	// public void __________(9)__________(String sender, String receiver, String header, String body) {
	public void sendEmail(String sender, String receiver, String header, String body) {
		// if(isValidSender(sender) && __________(10)__________(receiver) && __________(11)__________(header) && __________(12)__________(body)) {
		if(isValidSender(sender) && isValidRecipient(receiver) && isValidHeader(header) && isValidBody(body)) {
			Email email = new Email(sender, receiver, header, body);
			email = prepareEmail(email);
			// if(__________(13)__________(email)) {
			if(sendEmail(email)) {
				System.out.println("Email: \"" + email.getHeader() + "\" was sent successfully!");
			}
		} else {
			System.out.println("Invalid Email!");
		}
	}
}
