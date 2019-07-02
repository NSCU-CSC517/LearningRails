public class Client1 {
	public static void __________(1)__________() {
		String sender = "example1@example.com";
		String receiver = "other_user@example.com";
		String header = "Subject: Important Update 1";
		String body = "I need your input to validate the report";

		EmailSender emailSender = new EmailSender();
		emailSender.sendEmail(sender, receiver, header, body);
	}
}
