class DatabaseExtraction implements Extraction {

	public void extract() {
		// _________(4)_________
		open();

		// _________(5)_________
		System.out.println("I will extract by reading rows and columns.");

		// _________(6)_________
		close();
	}

	public void open() {
		System.out.println("Opening database file");
	}

	public void close() {
		System.out.println("Closing database file");
	}
}