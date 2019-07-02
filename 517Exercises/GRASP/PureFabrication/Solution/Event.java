import java.util.Date;

public class Event {
	Date event_time;
	String server_id;
	String event_description;

	public Event(Date date, String server, String desc) {
		// this.__________(7)__________ = date;
		this.event_time = date;
		// this.__________(8)__________ = server;
		this.server_id = server;
		// this.__________(9)__________ = desc;
		this.event_description = desc;
	}
}
