public __________(13)__________ class PCBuilder {
    protected Computer computer;

    public PCBuilder() {
        computer = __________(14)__________();
    }

    public PCBuilder addMonitor(int size) {
        Monitor monitor = __________(15)__________(size);
        computer.addMonitor(monitor);
        __________(16)__________;
    }

    public PCBuilder addRam(int size) {
        Ram ram = __________(17)__________(size);
        computer.addRam(ram);
        __________(18)__________;
    }

    public PCBuilder addHardDisk(int size) {
        HardDisk hardDisk = __________(19)__________(size);
        computer.addHardDisk(hardDisk);
        __________(20)__________;
    }

    public Computer getComputer() {
        return computer;
    }

    public __________(21)__________ PCBuilder __________(22)__________(String type);
}
