public class EventStorage {
	public static void __________(10)__________(Event ev) {
		System.out.println("INSERT INTO events (date, server, desc)");
		System.out.println("VALUES ( " + ev.event_time + "," + ev.server_id + "," + ev.event_description + ");");
	}
}
