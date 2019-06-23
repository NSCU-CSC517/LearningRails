class CSVExtraction implements Extraction {

	public void extract() {
		//__________(1)___________
		open();

		//__________(2)___________
		System.out.println("I will extract by separating row by commas.");

		//__________(3)___________
		close();
	}

	public void open() {
		System.out.println("Opening CSV file");
	}

	public void close() {
		System.out.println("Closing CSV file");
	}
}