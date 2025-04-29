package com.gustavnybergs.uppgifter.uppgift1;

import com.gustavnybergs.uppgifter.uppgift1.models.Discount;
import com.gustavnybergs.uppgifter.uppgift1.models.Product;
import com.gustavnybergs.uppgifter.uppgift1.models.ShoppingCart;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Mac", 1000.0, 1);
        Product product2 = new Product("iPhone", 500.0, 2);

        Discount discount = new Discount(10.0);

        ShoppingCart shoppingCart = new ShoppingCart(Arrays.asList(product1, product2), discount);

        System.out.println("Total_before_discount: $" + shoppingCart.getTotalBeforeDiscount());
        System.out.println("Total_after_discount: $" + shoppingCart.getTotalAfterDiscount());

    }
}
