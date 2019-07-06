import java.util.ArrayList;
import java.util.List;

public class Structure implements Group {
	private String name;
	private List<Group> groupList = new ArrayList<>();

	public Structure(String name) {
		this.name = name;
	}

	@Override
	public void assemble() {
		System.out.println("Assembling \"" + name + "\" structure using its list of child Group objects");
		for(Group group : groupList)
			// group.__________(4)__________();
			group.assemble();
		System.out.println("Created \"" + name + "\" structure from its list of child Group objects");
	}

	// public void __________(5)__________(Group group) {
	public void add(Group group) {
		groupList.add(group);
	}

	public void remove(Group group) {
		groupList.remove(group);
	}
}
