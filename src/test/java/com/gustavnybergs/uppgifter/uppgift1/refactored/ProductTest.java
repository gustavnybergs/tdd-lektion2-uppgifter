package com.gustavnybergs.uppgifter.uppgift1.refactored;

import com.gustavnybergs.uppgifter.uppgift1.models.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testGetTotalPrice() {

        // Skapa en instans av klassen du testar
        Product product = new Product("Dator", 1000.0, 1);

        // Använd assert för att kontrollera om resultatet är som förväntat
        assertEquals(1000.00, product.getTotalPrice(), "Total price should be 1000.00");

    }
}