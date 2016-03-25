package com.stockmarket.simple.formula.impl;

import com.stockmarket.simple.formula.IDividendYield;

/*
 * Preferred yield for stock
 * implements IDividendYield
 */
public class PreferredDividendYield implements IDividendYield {

    private final Double fixedDividend;
    private final Double parValue;
    private final Double price;

    public PreferredDividendYield(Double fixedDividend, Double parValue, Double price) {
        this.fixedDividend = fixedDividend;
        this.parValue = parValue;
        this.price = price;
    }

    public Double calculate() {
        return ((this.fixedDividend * this.parValue) / this.price);
    }

    public Double getFixedDividend() {
        return fixedDividend;
    }

    public Double getParValue() {
        return parValue;
    }

    public Double getPrice() {
        return price;
    }
}
