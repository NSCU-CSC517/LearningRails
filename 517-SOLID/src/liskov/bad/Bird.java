package liskov.bad;

public abstract class Bird {
	public int height = 0;
	
	//...
	
	public abstract void flyTo(int height);
	
	public int getHeight() { return height; }
	
	//...
	
}
