package exercises;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class Exercises1 extends BaseTest{

    @Test
    void open_onet_and_do_screens(){
        page.navigate("https://onet.pl");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots/onet.png")));
    }

}
