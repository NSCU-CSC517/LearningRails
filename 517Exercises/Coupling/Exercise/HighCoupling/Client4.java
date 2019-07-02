public class Client4 {
	public static void prepareAndSendEmail() {
		String sender = "example4@example.com";
		String receiver = "other_user@example.com";
		String header = "Subject: Important Update 4";
		String body = "I need your input to validate the report";

		EmailSender emailSender = new EmailSender();

		boolean isValidSender = emailSender.isValidSender(sender);
		boolean isValidRecipient = emailSender.isValidRecipient(receiver);
		boolean isValidHeader = emailSender.isValidHeader(header);
		boolean isValidBody = emailSender.isValidBody(body);

		if(isValidSender && isValidRecipient && isValidHeader && isValidBody) {
			Email email = new Email(sender, receiver, header, body);
			email = emailSender.prepareEmail(email);
			if(emailSender.sendEmail(email)) {
				System.out.println("Email: \"" + email.getHeader() + "\" was sent successfully!");
			}
		} else {
			System.out.println("Invalid Email!");
		}
	}
}
