public class BuilderDesignPattern {
	public static void main(String[] args){
		ComputerEngineer computerEngineer = new ComputerEngineer();

		Computer computer = computerEngineer.makeComputer();
		ComputerBuilder computerBuilder = computerEngineer.getComputerBuilder();
		computerBuilder.addHardDisk(64).addRam(256).addMonitor(17).addMonitor(28).addHardDisk(512).addHardDisk(1024).addHardDisk(2048).addMouse("Optical");
		System.out.println("Computer is assembled and with the following parts.");

		System.out.println("List of Monitors:");
		if(computer.getMonitorList().isEmpty()) {
			System.out.println("    None");
		} else {
			for (Monitor monitor : computer.getMonitorList())
				System.out.println("    " + monitor.getSize() + " inches");
		}

		System.out.println("List of RAMs:");
		if(computer.getRamList().isEmpty()) {
			System.out.println("    None");
		} else {
			for (Ram ram : computer.getRamList())
				System.out.println("    " + ram.getRamCapacity() + " MB");
		}

		System.out.println("Total Ram Capacity = " + computer.getRamCapacity() + " MB");

		System.out.println("List of HDDs:");
		if(computer.getHddList().isEmpty()) {
			System.out.println("    None");
		} else {
			for (HardDisk hardDisk : computer.getHddList())
				System.out.println("    " + hardDisk.getHardDiskCapacity() + " GB");
		}

		System.out.println("Total HDD Capacity = " + computer.getHddCapacity() + " GB");

		if(computer.getMouse() == null)
			System.out.println("Computer Mouse Type = NONE");
		else
			System.out.println("Computer Mouse Type = " + computer.getMouse().getMouseType());
	}
}
