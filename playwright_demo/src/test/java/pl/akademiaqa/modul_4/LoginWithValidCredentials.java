package pl.akademiaqa.modul_4;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

import java.awt.*;

class LoginWithValidCredentials extends BaseTest {

     @Test
     void should_login_with_valid_credentials(){

         // Naviguje do strony logowania
         page.navigate("http://localhost:7080/login");
         //page.pause();


         // Wypełnia pole użytkownika nazwą użytkownika "tomsmith"
         page.getByLabel("Username").fill("tomsmith");


         // Wypełnia pole hasła hasłem "SuperSecretPassword!"
         page.getByLabel("Password").fill("SuperSecretPassword!");


         // Lokalizuje przycisk "Login" i kliknie go
         page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();

         PlaywrightAssertions.assertThat(page.getByText("You logged into a secure area!")).isVisible();
         page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Logout")).click();
         PlaywrightAssertions.assertThat(page.getByText("You logged out of the secure area!")).isVisible();






     }
}
