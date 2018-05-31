package lowcoupling;

public class Client2 {
	public static void prepareAndSendEmail() {
		String sender = "example2@example.com";
		String recepient = "other_user@example.com";
		String header = "Subject: Important Update 2";
		String body = "I need your input to validate the report";
		
		EmailSender es = new EmailSender();
		es.prepareAndSendEmail(sender, recepient, header, body);
	}
}
