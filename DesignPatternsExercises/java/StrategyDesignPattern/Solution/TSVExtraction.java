class TSVExtraction implements Extraction {

	public void extract() {
		// __________(10)__________
		open();

		// __________(11)__________
		System.out.println("I will extract by separating row by tabs.");

		// __________(12)__________
		close();
	}

	public void open() {
		System.out.println("Opening TSV file");
	}

	public void close() {
		System.out.println("Closing TSV file");
	}
}
