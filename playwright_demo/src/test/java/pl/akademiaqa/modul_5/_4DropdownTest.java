package pl.akademiaqa.modul_5;

import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class _4DropdownTest extends BaseTest {


    @Test
    void dropdownTest(){

        page.navigate("http://localhost:7080/dropdown");
        page.selectOption("#dropdown","Option 2");//wartosc
        page.selectOption("#dropdown","1");//value
        page.getByRole(AriaRole.LISTBOX).selectOption(new String[] {"ms2", "ms3"});



    }
}
