package ocp.ok;

import java.math.BigDecimal;

public interface Discount {

    BigDecimal apply(BigDecimal price);
}
