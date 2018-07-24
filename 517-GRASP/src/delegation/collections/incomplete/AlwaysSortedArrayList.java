package delegation.collections.incomplete;
import java.util.ArrayList;
import java.util.Collections;

public class AlwaysSortedArrayList {
	private ArrayList<String> list;
	      
		  //7
	public ___ () {
		list = new ___(); //1
	}
	
	public void remove(int index) {
		list.remove(index);
	}
	
	public String get(int index) {
		return list.get(index);
	}
	
	public void add(String s) {
		list.add(s);
		Collections.sort(___); //2
	}
	
	public void set(int index, String s) {
		list.set(index, s);
		Collections.sort(___); //3
	}
	
	public void appendList(ArrayList<String> newlist) {
		list.addAll(newlist);
		Collections.sort(___); //4
	}
	
	public void display() {
		System.out.println("---");
		for (String s : ___ ) //5
			System.out.println(s);
		System.out.println("---");
	}
	
	public int size() {
		return list.___(); //6
	}
}
