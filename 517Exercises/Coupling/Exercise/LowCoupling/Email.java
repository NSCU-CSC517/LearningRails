public class Email {
	private String sender;
	private String receiver;
	private String header;
	private String body;
	private String status;

	public __________(5)__________(String sender, String receiver, String header, String body) {
		this.sender = sender;
		this.receiver = receiver;
		this.header = header;
		this.body = body;
		this.status = "NOT SENT";
	}

	public void __________(6)__________(String status) {
		this.status = status;
	}

	public String __________(7)__________() {
		return status;
	}

	public String __________(8)__________() {
		return header;
	}
}
