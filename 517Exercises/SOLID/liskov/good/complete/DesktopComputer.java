package liskov.good.complete;

public class DesktopComputer extends Computer implements HardwareUpgradable {

	public void addRam(int gb) {
		this.amount_of_ram += gb;
	}

	public void updateOS() {
		this.os_version += 1;
	}

}
