public class CommandDesignPattern {
	public static void main(String[] args) {
		Extraction extraction = new CsvExtraction();
		ExtractingTool extractingTool = new ExtractingTool(extraction);
		extractingTool.startExtraction();

		extraction = new DbExtraction();
		extractingTool.setExtraction(extraction);
		extractingTool.startExtraction();

		extraction = new TsvExtraction();
		extractingTool.setExtraction(extraction);
		extractingTool.startExtraction();
	}
}
