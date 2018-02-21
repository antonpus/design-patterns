package structural.bridge.page;

import structural.bridge.theme.Theme;

public class HomePage extends WebPage {
    public HomePage(Theme theme) {
        super(theme);
    }

    @Override
    public String getContent() {
        return "Home page in " + getColor();
    }
}
