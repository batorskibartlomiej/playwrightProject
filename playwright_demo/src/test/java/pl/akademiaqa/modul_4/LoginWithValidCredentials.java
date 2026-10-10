package pl.akademiaqa.modul_4;

import com.microsoft.playwright.Locator;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

 class LoginWithValidCredentials extends BaseTest {

     @Test
     void should_login_with_valid_credentials(){

         // Naviguje do strony logowania
         page.navigate("http://localhost:7080/login");
         System.out.println("test");

         // Wypełnia pole użytkownika nazwą użytkownika "tomsmith"
         page.fill("#username","tomsmith");

         // Wypełnia pole hasła hasłem "SuperSecretPassword!"
         page.fill("id=password","SuperSecretPassword!");

         // Lokalizuje przycisk "Login" i kliknie go
         Locator button = page.locator("text=Login").last();
         button.click();

         // Wstrzymuje wykonanie testu na 2 sekundy
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

     }
}
