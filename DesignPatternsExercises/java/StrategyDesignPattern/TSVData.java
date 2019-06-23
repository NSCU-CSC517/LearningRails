class TSVData implements Data {

	public String whichDataType() {
		return "TSV";
	}

	public void extractData() {
		new TSVExtraction().extract();
	}
}
