// public class Editor implements __________(3)__________ {
public class Editor implements ApplicationComponent {
	// __________(4)__________ theme = new LightTheme();
	Theme theme = new LightTheme();

	@Override
	// public void __________(5)__________(Theme theme) {
	public void setTheme(Theme theme) {
		this.theme = theme;
		System.out.println(
				"Editor : Applying theme with background color " + this.theme.backgroundColor + " and font color " + this.theme.fontColor);
	}
}
