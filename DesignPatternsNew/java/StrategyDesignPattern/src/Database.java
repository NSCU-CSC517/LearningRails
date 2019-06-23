
class Database implements Data {

	public String whichDataType() {
		return "Database";
	}

	public void extractData() {
		new DatabaseExtraction().extract();
	}
}