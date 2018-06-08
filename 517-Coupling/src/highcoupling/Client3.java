package highcoupling;

public class Client3 {
	public static void prepareAndSendEmail() {
		String sender = "example3@example.com";
		String receiver = "other_user@example.com";
		String header = "Subject: Important Update 3";
		String body = "I need your input to validate the report";
		
		EmailSender es = new EmailSender();
		
		boolean valid_sender = es.isValidSender(sender);
		boolean valid_receiver = es.isValidRecepient(receiver);
		boolean valid_header = es.isValidHeader(header);
		boolean valid_body = es.isValidBody(body);
		
		if ( valid_sender && valid_receiver && valid_header && valid_body ) {
			Email e = new Email (sender, receiver, header, body);
			e = es.prepareEmail(e);
			es.sendEmail(e);
		} else {
			System.out.println("Invalid Email!");
		}
	}
}
