public class Client3 {
	public static void __________(3)__________() {
		String sender = "example3@example.com";
		String receiver = "other_user@example.com";
		String header = "Subject: Important Update 3";
		String body = "I need your input to validate the report";

		EmailSender emailSender = new EmailSender();
		emailSender.sendEmail(sender, receiver, header, body);
	}
}
