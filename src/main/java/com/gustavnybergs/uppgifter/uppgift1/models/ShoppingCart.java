package com.gustavnybergs.uppgifter.uppgift1.models;

import java.util.List;

public class ShoppingCart {

    private List<Product> products;
    private Discount discount;


    // Konstruktor
    public ShoppingCart(List<Product> products, Discount discount) {
        this.products = products;
        this.discount = discount;
    }

    // Getter och setter
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getTotalBeforeDiscount(){
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public double getTotalAfterDiscount(){
        double totalBeforeDiscount = getTotalBeforeDiscount();
        double discountAmount = discount.calculateDiscountAmount(totalBeforeDiscount);
        return totalBeforeDiscount - discountAmount;
    }

}
