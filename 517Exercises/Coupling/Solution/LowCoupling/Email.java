public class Email {
	private String sender;
	private String receiver;
	private String header;
	private String body;
	private String status;

	// public __________(5)__________(String sender, String receiver, String header, String body) {
	public Email(String sender, String receiver, String header, String body) {
		this.sender = sender;
		this.receiver = receiver;
		this.header = header;
		this.body = body;
		this.status = "NOT SENT";
	}

	// public void __________(6)__________(String status) {
	public void setStatus(String status) {
		this.status = status;
	}

	// public String __________(7)__________() {
	public String getStatus() {
		return status;
	}

	// public String __________(8)__________() {
	public String getHeader() {
		return header;
	}
}
