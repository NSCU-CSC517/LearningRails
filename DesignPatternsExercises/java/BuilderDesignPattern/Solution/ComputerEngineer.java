public class ComputerEngineer {
	// private __________(1)__________ computerBuilder;
	private ComputerBuilder computerBuilder;

	public ComputerEngineer() {
		// computerBuilder = __________(2)__________();
		computerBuilder = new ComputerBuilder();
	}

	public Computer makeComputer() {
		// return computerBuilder.__________(3)__________();
		return computerBuilder.getComputer();
	}

	public ComputerBuilder getComputerBuilder() {
		return computerBuilder;
	}
}
