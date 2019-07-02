// class DbExtraction implements __________(7)__________ {
class DbExtraction implements Extraction {
	Extractor dbExtractor = new DbExtractor();

	@Override
	public void callCorrectExtraction() {
		// dbExtractor.__________(8)__________();
		dbExtractor.extract();
	}
}
