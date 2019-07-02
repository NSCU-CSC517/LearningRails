class ExtractingTool {
	// private __________(1)__________ extraction;
	private Extraction extraction;

	public ExtractingTool(Extraction extraction) {
		this.extraction = extraction;
	}

	public void setExtraction(Extraction extraction) {
		this.extraction = extraction;
	}

	// public void __________(2)__________() {
	public void startExtraction() {
		// extraction.__________(3)__________();
		extraction.callCorrectExtraction();
	}
}
