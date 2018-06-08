package liskov.bad;

public class Ostrich extends Bird {

	@Override
	public void flyTo(int height) {
		//Can't fly!
		throw new UnsupportedOperationException();
	}

	
}
