package purefabrication.complete;

import java.util.Date;

public class Event {
	// ...
	Date event_time;
	String server_id;
	String event_description;
	// ...
	
	public Event(Date date, String server, String desc) {
		this.event_time = date;
		this.server_id = server;
		this.event_description = desc;
	}
}
