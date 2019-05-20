package liskov.good.incomplete;

public abstract class Computer {
	public int amount_of_ram = 4;
	public int os_version = 1;
	
	public abstract void updateOS();
}
