import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	// private List<__________(5)__________> homeTheatreList = new ArrayList<>();
	private List<Memento> homeTheatreList = new ArrayList<>();

	public void addMemento(Memento memento) {
		 homeTheatreList.add(memento);
	}

	// public Memento __________(6)__________(int index) {
	public Memento getMemento(int index) {
		return homeTheatreList.get(index);
	}
}
