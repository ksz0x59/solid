package ocp.bad;

import java.math.BigDecimal;

import java.math.BigDecimal;

public class DiscountService {

    public BigDecimal applyDiscounts(BigDecimal price,Discount discount) {

        BigDecimal discountPrice = price.add(BigDecimal.ZERO);
        discountPrice = discount.apply(discountPrice);
        return discountPrice;
    }

    public BigDecimal applySeniorDiscount(BigDecimal price,SeniorDiscount discount) {

        return discount.apply(price);
    }

}
