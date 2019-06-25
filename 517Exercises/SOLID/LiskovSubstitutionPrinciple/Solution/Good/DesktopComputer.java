// public class DesktopComputer extends Computer implements __________(4)__________ {
public class DesktopComputer extends Computer implements HardwareUpgradable {
	// public void __________(5)__________(int gb) {
	public void addRam(int gb) {
		this.amount_of_ram += gb;
	}

	// public void __________(6)__________() {
	public void updateOS() {
		this.os_version += 1;
	}
}
