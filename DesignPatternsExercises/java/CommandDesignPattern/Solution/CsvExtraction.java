// class CsvExtraction implements __________(5)__________ {
class CsvExtraction implements Extraction {
	Extractor csvExtractor = new CsvExtractor();

	@Override
	public void callCorrectExtraction() {
		// csvExtractor.__________(6)__________();
		csvExtractor.extract();
	}
}
