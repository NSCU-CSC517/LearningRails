public class BridgeDesignPattern {
    public static void main(String[] args) {
        DarkTheme darkTheme = new DarkTheme();
        LightTheme lightTheme = new LightTheme();

        Editor editor = new Editor();
        editor.setTheme(darkTheme);

        Terminal terminal = new Terminal();
        terminal.setTheme(lightTheme);
    }
}
