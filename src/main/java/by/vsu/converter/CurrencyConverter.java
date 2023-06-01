package by.vsu.converter;

import java.math.BigDecimal;

public interface CurrencyConverter {
    BigDecimal toDollars(BigDecimal money);
    BigDecimal toRubles(BigDecimal money);
}
