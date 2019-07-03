import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	private List<__________(5)__________> homeTheatreList = new ArrayList<>();

	public void addMemento(Memento memento) {
		 homeTheatreList.add(memento);
	}

	public Memento __________(6)__________(int index) {
		return homeTheatreList.get(index);
	}
}
