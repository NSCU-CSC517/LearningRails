import java.awt.Frame;

// public class WindowsGUI implements __________(9)__________ {
public class WindowsGUI implements GUI {
	@Override
	public void display() {
		Frame frame = new Frame("Windows Application");
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
