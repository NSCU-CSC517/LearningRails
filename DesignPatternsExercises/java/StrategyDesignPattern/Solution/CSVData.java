class CSVData implements Data {
	public String whichDataType() {
		return "CSV";
	}
	public void extractData() {
		new CSVExtraction().extract();
	}
}
