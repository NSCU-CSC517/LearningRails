public class Editor implements __________(4)__________ {
    private Theme theme;

    @Override
    public void setTheme(Theme theme) {
        this.theme = theme;
        System.out.println("Editor: Applying theme with background color " + this.theme.getBackgroundColor() +
                " and font color " + this.theme.getFontColor());
    }
}
