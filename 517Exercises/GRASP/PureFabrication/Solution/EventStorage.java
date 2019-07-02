public class EventStorage {
	// public static void __________(10)__________(Event event) {
	public static void saveToDB(Event event) {
		System.out.println("INSERT INTO events (date, server, desc)");
		System.out.println("VALUES ( " + event.eventTime + "," + event.serverId + "," + event.eventDescription + ");");
	}
}
