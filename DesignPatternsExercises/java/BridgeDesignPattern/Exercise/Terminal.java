public class Terminal implements __________(7)__________ {
    private Theme theme;

    @Override
    public void setTheme(Theme theme) {
        this.theme = theme;
        System.out.println("Terminal: Applying theme with background color " + this.theme.getBackgroundColor() +
                " and font color " + this.theme.getFontColor());
    }
}
