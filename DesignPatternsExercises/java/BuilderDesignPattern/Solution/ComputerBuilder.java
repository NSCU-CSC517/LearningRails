// public class ComputerBuilder implements __________(8)__________ {
public class ComputerBuilder implements PCBuilder {
	// private __________(9)__________ computer;
	private Computer computer;

	public ComputerBuilder() {
		// computer = __________(10)__________();
		computer = new Computer();
	}

	@Override
	public ComputerBuilder addMonitor(int size) {
		Monitor monitor = new Monitor(size);
		// computer.__________(11)__________(monitor);
		computer.addMonitor(monitor);
		// return __________(12)__________;
		return this;
	}

	@Override
	public ComputerBuilder addMouse(String type) {
		Mouse mouse = new Mouse(type);
		// computer.__________(13)__________(mouse);
		computer.addMouse(mouse);
		// return __________(14)__________;
		return this;
	}

	@Override
	public ComputerBuilder addRam(int size) {
		Ram ram = new Ram(size);
		// computer.__________(15)__________(ram);
		computer.addRam(ram);
		// return __________(16)__________;
		return this;
	}

	@Override
	public ComputerBuilder addHardDisk(int size) {
		HardDisk hardDisk = new HardDisk(size);
		// computer.__________(17)__________(hardDisk);
		computer.addHardDisk(hardDisk);
		// return __________(18)__________;
		return this;
	}

	public Computer getComputer() {
		return computer;
	}
}
