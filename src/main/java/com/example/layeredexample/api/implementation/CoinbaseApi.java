package com.example.layeredexample.api.implementation;

import com.example.layeredexample.api.CurrencyApi;
import org.springframework.stereotype.Component;

@Component("CoinbaseApi")
public class CoinbaseApi implements CurrencyApi {
    @Override
    public Integer getUsdValue(String currency) {
        switch (currency.toUpperCase()) {
            case "BTC": return getRandomNumber(36000, 51000);
            case "ETH": return getRandomNumber(1100, 2100);
            default: return getRandomNumber(10, 300);
        }
    }

    @Override
    public String getSource() {
        return "Coinbase";
    }
}
