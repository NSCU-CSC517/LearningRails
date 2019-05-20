package lowcoupling;

public class Client1 {
	public static void prepareAndSendEmail() {
		String sender = "example1@example.com";
		String recepient = "other_user@example.com";
		String header = "Subject: Important Update 1";
		String body = "I need your input to validate the report";
		
		EmailSender es = new EmailSender();
		es.sendEmail(sender, recepient, header, body);
	}
}
