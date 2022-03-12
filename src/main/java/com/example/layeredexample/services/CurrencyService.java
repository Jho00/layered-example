package com.example.layeredexample.services;

import com.example.layeredexample.api.CurrencyApi;
import com.example.layeredexample.dto.Currency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CurrencyService {
    private final CurrencyApi apiClient;

    public CurrencyService(@Qualifier("CoinbaseApi") CurrencyApi apiClient) {
        this.apiClient = apiClient;
    }

    public Currency getValue(String currency) {
        return new Currency(currency, apiClient.getUsdValue(currency), apiClient.getSource());
    }
}
