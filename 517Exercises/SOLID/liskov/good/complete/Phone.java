package liskov.good.complete;

public class Phone extends Computer {

	public void updateOS() {
		this.os_version+=1;
	}

}
