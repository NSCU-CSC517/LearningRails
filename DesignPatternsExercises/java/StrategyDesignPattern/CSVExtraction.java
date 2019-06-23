class CSVExtraction implements Extraction {

	public void extract() {
		// _________(1)_________
		open();

		// _________(2)_________
		System.out.println("I will extract by separating row by commas.");

		// _________(3)_________
		close();
	}

	public void open() {
		System.out.println("Opening CSV file");
	}

	public void close() {
		System.out.println("Closing CSV file");
	}
}