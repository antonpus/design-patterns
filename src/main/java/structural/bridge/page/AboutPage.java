package structural.bridge.page;

import structural.bridge.theme.Theme;

public class AboutPage extends WebPage {

    public AboutPage(Theme theme) {
        super(theme);
    }

    @Override
    public String getContent() {
        return "About page in " + getColor();
    }
}
