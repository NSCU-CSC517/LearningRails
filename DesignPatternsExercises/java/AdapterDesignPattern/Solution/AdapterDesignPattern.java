public class AdapterDesignPattern {
	public static void main(String[] args) {
		// GUIAdapter gui = new GUIAdapter(__________(1)__________);
		GUIAdapter gui = new GUIAdapter(getOperatingSystem());
		// gui.__________(2)__________();
		gui.display();
	}

	public static String getOperatingSystem() {
		return System.getProperty("os.name");
	}
}
