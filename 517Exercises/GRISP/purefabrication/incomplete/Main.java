package purefabrication.incomplete;

import java.util.Date;

import purefabrication.complete.Event;
import purefabrication.complete.EventStorage;

public class Main {

	public static void main(String[] args) {
		//...
		//1         //2
		___ e1 = new ___(new Date(), "Server 1", "Turned on server");
		EventStorage.___(e1); //3
		//...
		//4            //5
		___ e2 = new ___(new Date(), "Server 1", "Started webapp");
		EventStorage.___(e2); //6
		//...
		//7             //8
		___ e3 = new ___(new Date(), "Server 1", "New connection!");
		EventStorage.___(e3); //9
		//...

	}

}
