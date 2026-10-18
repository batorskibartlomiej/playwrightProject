package pl.akademiaqa.modul_5;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class _2InputTest extends BaseTest {

    @Test
    void inputTest(){

        page.navigate("http://localhost:7080/login");
        page.fill("#username", "bartek");//wkleja tekst
        page.type("#password", "bartek");//wpisuje znak po znaku

        page.fill("#username", "wartosc", new Page.FillOptions().setForce(true));//pozwala ominac wyszarzone pola



    }
}
