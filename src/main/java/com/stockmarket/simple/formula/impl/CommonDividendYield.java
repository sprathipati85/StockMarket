package com.stockmarket.simple.formula.impl;

import com.stockmarket.simple.formula.IDividendYield;

/*
 * /*
 * calculate common DividendYield for stock
 * implements IDividendYield
 */
public class CommonDividendYield implements IDividendYield {

    private final Double lastDividend;
    private final Double price;

    public CommonDividendYield(Double fixedDividend,  Double price) {
        this.lastDividend = fixedDividend;
        this.price = price;
    }

    public Double calculate() {
        return (this.lastDividend / this.price);
    }

    public Double getFixedDividend() {
        return lastDividend;
    }

    public Double getPrice() {
        return price;
    }
}
