package com.stockmarket.simple.formula.impl;

import com.stockmarket.simple.formula.IPERatio;

/*
 * P/E Ratio of a stock
 * 
 */
public class PERatio implements IPERatio {

    private final Double price;
    private final Double dividend;

    public PERatio(Double price, Double dividend) {
        this.price = price;
        this.dividend = dividend;
    }

    public Double calculate() {
        return this.price / this.dividend;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDividend() {
        return dividend;
    }

}