package com.gustavnybergs.uppgifter.uppgift1.refactored;

public class Discount {

    private double discountRate;

    public Discount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double calculateDiscountAmount(double totalBeforeDiscount) {
        return totalBeforeDiscount * (discountRate / 100);
    }
}
