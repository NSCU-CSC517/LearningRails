package liskov.good.incomplete;

public class ComputerUpgrader {
	public void upgradeRAM(___ d) { //2
		d.addRam(16);	
	}
	
	public void upgradeOS(___ d) { //3
		d.updateOS();
	}
}
