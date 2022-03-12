package com.example.layeredexample.controllers;

import com.example.layeredexample.dto.Currency;
import com.example.layeredexample.services.CurrencyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping(path = "/value")
    public Currency getCurrency(@RequestHeader(name = "X-Auth", required = false) String headerValue,
                                @RequestParam(name = "currency", required = false) String currency) {
        return currencyService.getValue(currency);
    }
}
