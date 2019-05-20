package purefabrication.complete;

import java.util.Date;

import purefabrication.incomplete.Event;
import purefabrication.incomplete.EventStorage;

public class Main {

	public static void main(String[] args) {
		//...
		Event e1 = new Event(new Date(), "Server 1", "Turned on server");
		EventStorage.saveToDB(e1);
		//...
		Event e2 = new Event(new Date(), "Server 1", "Started webapp");
		EventStorage.saveToDB(e2);
		//...
		Event e3 = new Event(new Date(), "Server 1", "New connection!");
		EventStorage.saveToDB(e3);
		//...

	}

}
