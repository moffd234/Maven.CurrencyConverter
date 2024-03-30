package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        /*
        (Conversion rate of A to UC) * (Conversion rate of Universal Currency to B) = conversion
        i.e. 1.88 (euro) * 1(UC) / 2(USD) = X
        or   1.88 (euro) * 1(UC) / 2.7(AUS) = X
         */
        return Double.MAX_VALUE;
    }
}
