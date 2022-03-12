package com.example.layeredexample.api;

public interface CurrencyApi {
    Integer getUsdValue(String currency);

    String getSource();

    default int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
