public class BridgeClient {
	public static void main(String[] args) {
		DarkTheme darkTheme =  new DarkTheme();
		LightTheme lightTheme = new LightTheme();

		Editor editor = new Editor();
		editor.__________(1)__________(darkTheme);

		Terminal terminal = new Terminal();
		terminal.__________(2)__________(lightTheme);
	}
}
