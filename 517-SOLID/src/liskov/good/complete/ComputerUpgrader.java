package liskov.good.complete;

public class ComputerUpgrader {
	public void upgradeRAM(DesktopComputer d) {
		d.addRam(16);	
	}
	
	public void upgradeOS(Computer d) {
		d.updateOS();
	}
}
