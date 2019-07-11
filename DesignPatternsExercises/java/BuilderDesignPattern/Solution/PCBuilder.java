// public __________(13)__________ class PCBuilder {
public abstract class PCBuilder {
    protected Computer computer;

    public PCBuilder() {
        // computer = __________(14)__________();
        computer = new Computer();
    }

    public PCBuilder addMonitor(int size) {
        // Monitor monitor = __________(15)__________(size);
        Monitor monitor = new Monitor(size);
        computer.addMonitor(monitor);
        // __________(16)__________;
        return this;
    }

    public PCBuilder addRam(int size) {
        // Ram ram = __________(17)__________(size);
        Ram ram = new Ram(size);
        computer.addRam(ram);
        // __________(18)__________;
        return this;
    }

    public PCBuilder addHardDisk(int size) {
        // HardDisk hardDisk = __________(19)__________(size);
        HardDisk hardDisk = new HardDisk(size);
        computer.addHardDisk(hardDisk);
        // __________(20)__________;
        return this;
    }

    public Computer getComputer() {
        return computer;
    }

    // public __________(21)__________ PCBuilder __________(22)__________(String type);
    public abstract PCBuilder addMouse(String type);
}
