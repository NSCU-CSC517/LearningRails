package dependencyinversion.bad;

public class DocumentManager {
	String documentText;
	int paperWidth;
	int paperHeight;
	
	public DocumentManager(String title, String text, int width, int height) {
		documentText = text;
		
		paperWidth = width;
		paperHeight = height;
	}
	
	public void print() {
		if (paperWidth < 8.5)
			SmallPrinter.printSmallDocument(documentText);
		else
			BigPrinter.printBigDocument(documentText);
	}
}
