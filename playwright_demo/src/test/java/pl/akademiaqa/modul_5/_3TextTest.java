package pl.akademiaqa.modul_5;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class _3TextTest extends BaseTest {


    @Test
    void textTest(){

        page.navigate("http://localhost:7080/notification_message_rendered");

        //1.innerHTML()= tags + text
        System.out.println(page.innerHTML("#content"));

        //2.innerTExt= text
        System.out.println(page.innerText("#content"));

        //3.textContent()= text widoczny i niewidoczny
        System.out.println(page.textContent("#content"));

        //4.getAttribute()- atrybuity elementow html
        System.out.println(page.getAttribute("div img", "alt"));

    }
}
