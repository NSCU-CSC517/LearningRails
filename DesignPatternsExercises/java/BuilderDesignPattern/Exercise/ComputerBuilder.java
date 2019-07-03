public class ComputerBuilder implements __________(6)__________ {
	private __________(7)__________ computer;

	public ComputerBuilder() {
		computer = __________(8)__________();
	}

	@Override
	public ComputerBuilder addMonitor(int size) {
		Monitor monitor = new Monitor(size);
		computer.__________(9)__________(monitor);
		return __________(10)__________;
	}

	@Override
	public ComputerBuilder addMouse(String type) {
		Mouse mouse = new Mouse(type);
		computer.__________(11)__________(mouse);
		return __________(12)__________;
	}

	@Override
	public ComputerBuilder addRam(int size) {
		Ram ram = new Ram(size);
		computer.__________(13)__________(ram);
		return __________(14)__________;
	}

	@Override
	public ComputerBuilder addHardDisk(int size) {
		HardDisk hardDisk = new HardDisk(size);
		computer.__________(15)__________(hardDisk);
		return __________(16)__________;
	}

	public Computer getComputer() {
		return computer;
	}
}
