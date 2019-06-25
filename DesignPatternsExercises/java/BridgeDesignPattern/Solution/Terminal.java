// public class Terminal implements __________(6)__________ {
public class Terminal implements ApplicationComponent {
	// __________(7)__________ theme = new DarkTheme();
	Theme theme = new DarkTheme();

	@Override
	public void setTheme(Theme theme) {
		this.theme = theme;
		System.out.println("Terminal : Applying theme with background color " + this.theme.backgroundColor
				+ " and font color " + this.theme.fontColor);
	}
}
