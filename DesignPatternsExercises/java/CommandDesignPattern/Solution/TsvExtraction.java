// class TsvExtraction implements __________(9)__________ {
class TsvExtraction implements Extraction {
	Extractor tsvExtractor = new TsvExtractor();

	@Override
	public void callCorrectExtraction() {
		// tsvExtractor.__________(10)__________();
		tsvExtractor.extract();
	}
}
