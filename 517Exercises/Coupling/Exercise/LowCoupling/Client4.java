public class Client4 {
	public static void __________(4)__________() {
		String sender = "example4@example.com";
		String receiver = "other_user@example.com";
		String header = "Subject: Important Update 4";
		String body = "I need your input to validate the report";

		EmailSender emailSender = new EmailSender();
		emailSender.sendEmail(sender, receiver, header, body);
	}
}
