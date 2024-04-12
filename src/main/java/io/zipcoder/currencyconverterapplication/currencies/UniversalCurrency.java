package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    public Double convert(CurrencyType currencyType) {
        /*
        get rates for both currencies
        divide currencyType by australian rate
         */

        return currencyType.getRate();
    }
}
