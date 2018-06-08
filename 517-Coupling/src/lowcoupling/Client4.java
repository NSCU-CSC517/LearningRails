package lowcoupling;

public class Client4 {
	public static void prepareAndSendEmail() {
		String sender = "example4@example.com";
		String recepient = "other_user@example.com";
		String header = "Subject: Important Update 4";
		String body = "I need your input to validate the report";
		
		EmailSender es = new EmailSender();
		es.prepareAndSendEmail(sender, recepient, header, body);
	}
}
