class DatabaseExtraction implements Extraction {

	public void extract() {
		// __________(4)__________
		open();

		// __________(5)__________
		System.out.println("I will extract by reading rows and columns.");

		// __________(6)__________
		close();
	}

	public void open() {
		System.out.println("Opening database file");
	}

	public void close() {
		System.out.println("Closing database file");
	}
}
