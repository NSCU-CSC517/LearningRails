public class AdapterDesignPattern {
	public static void main(String[] args) {
		GUIAdapter gui = new GUIAdapter(__________(1)__________);
		gui.__________(2)__________();
	}

	public static String getOperatingSystem() {
		return System.getProperty("os.name");
	}
}
