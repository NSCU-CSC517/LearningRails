import java.util.Date;

public class PureFabrication {
	public static void main(String[] args) {
		// __________(1)__________ e1 = __________(2)__________ Event(new Date(), "Server 1", "Turned on server");
		Event e1 = new Event(new Date(), "Server 1", "Turned on server");
		EventStorage.saveToDB(e1);
		// __________(3)__________ e2 = __________(4)__________ Event(new Date(), "Server 1", "Started webapp");
		Event e2 = new Event(new Date(), "Server 1", "Started webapp");
		EventStorage.saveToDB(e2);
		// __________(5)__________ e3 = __________(6)__________ Event(new Date(), "Server 1", "New connection!");
		Event e3 = new Event(new Date(), "Server 1", "New connection!");
		EventStorage.saveToDB(e3);
	}
}
