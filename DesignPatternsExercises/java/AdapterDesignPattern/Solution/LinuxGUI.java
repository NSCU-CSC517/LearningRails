import javax.swing.JFrame;

// public class LinuxGUI implements __________(7)__________ {
public class LinuxGUI implements GUI {
	@Override
	public void display() {
		JFrame frame = new JFrame("Linux Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 300);
	}
}
