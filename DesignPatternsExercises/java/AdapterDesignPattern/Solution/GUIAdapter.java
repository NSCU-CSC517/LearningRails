// public class GUIAdapter implements __________(3)__________ {
public class GUIAdapter implements GUI {
	private WindowsGUI winGUI;
	private LinuxGUI linuxGUI;
	private MacGUI macGUI;

	public GUIAdapter(String operatingSystem) {
		if(operatingSystem.contains("Windows")) {
			winGUI = new WindowsGUI();
		} else if(operatingSystem.contains("Linux")) {
			linuxGUI = new LinuxGUI();
		} else if(operatingSystem.contains("Mac")) {
			macGUI = new MacGUI();
		} else {
			System.out.println("Unable to determine OS");
		}
	}

	@Override
	public void display() {
		if(winGUI != null) {
			// __________(4)__________.display();
			winGUI.display();
		} else if(linuxGUI != null) {
			// __________(5)__________.display();
			linuxGUI.display();
		} else if(macGUI != null) {
			// __________(6)__________.display();
			macGUI.display();
		} else {
			System.out.println("Unable to display GUI for unknown OS");
		}
	}
}
