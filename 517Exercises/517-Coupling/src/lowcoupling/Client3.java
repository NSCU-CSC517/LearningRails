package lowcoupling;

public class Client3 {
	public static void prepareAndSendEmail() {
		String sender = "example3@example.com";
		String recepient = "other_user@example.com";
		String header = "Subject: Important Update 3";
		String body = "I need your input to validate the report";
		
		EmailSender es = new EmailSender();
		es.sendEmail(sender, recepient, header, body);
	}
}