// public __________(8)__________ class Theme {
public abstract class Theme {
    private String backgroundColor;
    private String fontColor;

    public Theme(String backgroundColor, String fontColor) {
        this.backgroundColor = backgroundColor;
        this.fontColor = fontColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getFontColor() {
        return fontColor;
    }
}
