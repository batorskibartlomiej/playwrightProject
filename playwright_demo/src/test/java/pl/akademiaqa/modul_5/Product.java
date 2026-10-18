package pl.akademiaqa.modul_5;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class Product {

    private String dressName;
    private int price;

    public Product(String dressName, int price) {
        this.dressName = dressName;
        this.price = price;
    }
}
