package liskov.bad;

public class ComputerUpgrader {
	public void upgrade(Computer d) {
		if (!d.getClass().equals(Phone.class)) {
			d.addRam(16);
		}		
		d.updateOS();
	}
}
