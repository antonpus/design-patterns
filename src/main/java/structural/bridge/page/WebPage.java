package structural.bridge.page;

import structural.bridge.theme.Theme;

public abstract class WebPage {

    protected Theme theme;

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    public String getColor() {
        return theme.getColor();
    }

    public abstract String getContent();
}
