interface PCBuilder {
	// PCBuilder __________(4)__________(int size);
	PCBuilder addMonitor(int size);
	// PCBuilder __________(5)__________(int size);
	PCBuilder addHardDisk(int size);
	// PCBuilder __________(6)__________(int size);
	PCBuilder addRam(int size);
	// PCBuilder __________(7)__________(String type);
	PCBuilder addMouse(String type);
}
