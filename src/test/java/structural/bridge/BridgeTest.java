package structural.bridge;

import org.junit.Test;
import structural.bridge.page.AboutPage;
import structural.bridge.page.WebPage;
import structural.bridge.theme.DarkTheme;
import structural.bridge.theme.LightTheme;

public class BridgeTest {

    @Test
    public void bridgeApi() {

        WebPage inDark = new AboutPage(new DarkTheme());
        WebPage inLight = new AboutPage(new LightTheme());

        System.out.println(inDark.getContent());
        System.out.println(inLight.getContent());
    }
}