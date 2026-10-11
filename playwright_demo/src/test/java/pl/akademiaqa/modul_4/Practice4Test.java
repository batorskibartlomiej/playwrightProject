package pl.akademiaqa.modul_4;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

public class Practice4Test extends BaseTest {


    @Test
    void wrong_login(){

        page.navigate("http://localhost:7080/");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Form Authentication")).click();
        page.getByLabel("Username").fill("123");
        page.getByLabel("Password").fill("SuperSecretPassword!");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        PlaywrightAssertions.assertThat(page.getByText(" Your username is invalid!")).isVisible();

    }
    @Test
    void wrong_password(){

        page.navigate("http://localhost:7080/");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Form Authentication")).click();
        page.getByLabel("Username").fill("tomsmith");
        page.getByLabel("Password").fill("wrong");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        PlaywrightAssertions.assertThat(page.getByText(" Your password is invalid!")).isVisible();

    }
    @Test
    void without_usrenmae_password(){

        page.navigate("http://localhost:7080/");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Form Authentication")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
        PlaywrightAssertions.assertThat(page.getByText(" Your username is invalid!")).isVisible();

    }

}
