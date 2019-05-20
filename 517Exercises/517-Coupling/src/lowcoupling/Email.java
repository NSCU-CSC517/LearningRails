package lowcoupling;

public class Email {
	public String sender;
	public String receiver;
	public String header;
	public String body;
	public String status;
	
	public Email(String sender, String receiver, String header, String body) {
		this.sender = sender;
		this.receiver = receiver;
		this.header = header;
		this.body = body;
		this.status = "NOT SENT";
	}
}
