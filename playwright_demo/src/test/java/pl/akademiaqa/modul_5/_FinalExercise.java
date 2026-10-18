package pl.akademiaqa.modul_5;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitUntilState;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.common.BaseTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class _FinalExercise extends BaseTest {


    @Test
    void check_is_price_more_than_15() {
        page.navigate("https://web.archive.org/web/20251206092457/http://www.automationpractice.pl/index.php?id_category=8&controller=category",new Page.NavigateOptions().setWaitUntil(WaitUntilState.NETWORKIDLE));
        List<Product> products = getProducts();
        List<Integer>prices = new ArrayList<>();
        products.forEach(p-> prices.add(p.getPrice()));
        prices.forEach(System.out::println);
        Assertions.assertThat(prices.stream().allMatch(p->p >15)).isTrue();

    }

    @Test
    void should_verify_all_product_names_contains_printed() {
        page.navigate("https://web.archive.org/web/20251206092457/http://www.automationpractice.pl/index.php?id_category=8&controller=category");
        List<Product> products = getProducts();



    }



    private List<Product> getProducts(){

            page.navigate("https://web.archive.org/web/20251206092457/http://www.automationpractice.pl/index.php?id_category=8&controller=category");
            List<Locator> productLocators = page.locator(".product_list  .ajax_block_product").all();

            List<Product> products = new ArrayList<>();

            productLocators.forEach(p->{
                String name = p.locator(".right-block .product-name").innerText();
                String priceText = p.locator(".right-block .content_price .price").innerText().replace("$","").trim();
                Integer price = Integer.valueOf(priceText.split("\\.")[0]);
                products.add(new Product(name, price));

            });

            return products;
        }


    }

