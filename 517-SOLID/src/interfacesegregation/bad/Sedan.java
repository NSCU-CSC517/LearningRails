package interfacesegregation.bad;

public class Sedan implements Vehicle {

	public void loadPassengers() {
		System.out.println("Loading passengers into Sedan");
	}

	public void loadTrunk() {
		System.out.println("Loading trunk of Sedan");
	}

	public void loadTruckbed() {
		throw new UnsupportedOperationException();
	}

	public void drive() {
		System.out.println("Sedan is driving");
	}

}
