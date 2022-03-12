package com.example.layeredexample.api.implementation;

import com.example.layeredexample.api.CurrencyApi;
import org.springframework.stereotype.Component;

@Component("BinanceApi")
public class BinanceApi implements CurrencyApi {
    @Override
    public Integer getUsdValue(String currency) {
        switch (currency.toLowerCase()) {
            case "btc": return getRandomNumber(35000, 50000);
            case "eth": return getRandomNumber(1000, 2000);
            default: return getRandomNumber(0, 1000);
        }
    }

    @Override
    public String getSource() {
        return "Binance";
    }
}
