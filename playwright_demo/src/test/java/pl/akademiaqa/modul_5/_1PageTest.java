package pl.akademiaqa.modul_5;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.KeyboardModifier;
import com.microsoft.playwright.options.MouseButton;
import com.microsoft.playwright.options.WaitUntilState;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

import java.util.Arrays;

public class _1PageTest extends BaseTest {



    @Test
    void pageTest(){

        page.navigate("http://localhost:7080/");
        page.navigate("http://localhost:7080/", new Page.NavigateOptions().setTimeout(10000));//30 sek
        page.navigate("http://localhost:7080/", new Page.NavigateOptions().setWaitUntil(WaitUntilState.LOAD));//tak jest domyslnie
        page.navigate("http://localhost:7080/", new Page.NavigateOptions().setReferer("https://onet.pl"));//nadpisujemy z zjakiej strony zostalismy przeniesieni
        page.reload();
        page.goBack();
        page.goForward();
        page.click("d", new Page.ClickOptions().setClickCount(10));
        page.click("d",new Page.ClickOptions().setButton(MouseButton.RIGHT));
        page.click("d", new Page.ClickOptions().setModifiers(Arrays.asList(KeyboardModifier.CONTROL,KeyboardModifier.ALT)));
        page.dblclick("d");
        page.check("d");
        page.uncheck("d");

                //1.domcontentloaded- html jest zaladowany, ale css i js jeszcze nie
                //2. - html i css i js sa zaladowane
                //3. NETWORKIDLE -  nie ma juz zandych dodatkowych requestow przez 500ms

    }
}
