package ocp.ok;

import java.math.BigDecimal;

public class DiscountManagement {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(10000);
        Discount [] discounts = new Discount[1];

        discounts[0] = new AdultDiscount();

        DiscountService discountService = new DiscountService();
        BigDecimal discountedPrice = discountService.applyDiscounts(price, discounts);
        System.out.println("Price before discount is " + price);
        System.out.println("Discounted price is " + discountedPrice);

        discounts[0] = new SeniorDiscount();
        discountedPrice = discountService.applyDiscounts(price, discounts);
        System.out.println("Price before discount is " + price);
        System.out.println("Discounted price is " + discountedPrice);

    }
}
