package liskov.good.incomplete;

public class DesktopComputer extends Computer implements ___ { //4

	public void ___(int gb) { //5
		this.amount_of_ram += gb;
	}

	public void ___() { //6
		this.os_version += 1;
	}

}
