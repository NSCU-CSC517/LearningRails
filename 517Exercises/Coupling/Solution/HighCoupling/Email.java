public class Email {
	private String sender;
	private String receiver;
	private String header;
	private String body;
	private String status;

	public Email(String sender, String receiver, String header, String body) {
		this.sender = sender;
		this.receiver = receiver;
		this.header = header;
		this.body = body;
		this.status = "NOT SENT";
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public String getHeader() {
		return header;
	}
}
