package interfacesegregation.bad;

public class Truck implements Vehicle {

	public void loadPassengers() {
		System.out.println("Loading passengers into Truck");
	}

	public void loadTrunk() {
		throw new UnsupportedOperationException();
	}

	public void loadTruckbed() {
		System.out.println("Loading truckbed");
	}

	public void drive() {
		System.out.println("Truck is driving");
	}

}
