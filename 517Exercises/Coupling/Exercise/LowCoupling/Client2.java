public class Client2 {
	public static void __________(2)__________() {
		String sender = "example2@example.com";
		String receiver = "other_user@example.com";
		String header = "Subject: Important Update 2";
		String body = "I need your input to validate the report";

		EmailSender emailSender = new EmailSender();
		emailSender.sendEmail(sender, receiver, header, body);
	}
}
