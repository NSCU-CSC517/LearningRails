package liskov.bad;

public class DesktopComputer extends Computer {

	public void addRam(int gb) {
		this.amount_of_ram += gb;
	}

	public void updateOS() {
		this.os_version += 1;
	}

}
