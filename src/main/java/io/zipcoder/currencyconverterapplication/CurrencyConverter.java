package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    /*
    (Conversion rate of A to UC) * (Conversion rate of Universal Currency to B) = conversion
    i.e. 1.88 (euro) * 1(UC) / 2(USD) = X
    or   1.88 (euro) * 1(UC) / 2.7(AUS) = X
     */
    public static Double convert(Double amountOfBaseCurrency,
                                 ConvertableCurrency sourceCurrencyType,
                                 CurrencyType targetCurrencyType) {
        return amountOfBaseCurrency *
        (sourceCurrencyType.convert(targetCurrencyType));
    }
}
