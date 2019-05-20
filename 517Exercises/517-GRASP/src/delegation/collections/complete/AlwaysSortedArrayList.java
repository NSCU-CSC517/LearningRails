package delegation.collections.complete;
import java.util.ArrayList;
import java.util.Collections;

public class AlwaysSortedArrayList {
	private ArrayList<String> list;
	
	public AlwaysSortedArrayList () {
		list = new ArrayList<String>();
	}
	
	public void remove(int index) {
		list.remove(index);
	}
	
	public String get(int index) {
		return list.get(index);
	}
	
	public void add(String s) {
		list.add(s);
		Collections.sort(list);
	}
	
	/* set value of string at index to 's' */
	/* corresponds to the ArrayList set method */
	public void set(int index, String s) {
		list.set(index, s);
		Collections.sort(list);
	}
	
	public void appendList(ArrayList<String> newlist) {
		list.addAll(newlist);
		Collections.sort(list);
	}
	
	public void display() {
		System.out.println("---");
		for (String s : list )
			System.out.println(s);
		System.out.println("---");
	}
	
	public int size() {
		return list.size();
	}
}
