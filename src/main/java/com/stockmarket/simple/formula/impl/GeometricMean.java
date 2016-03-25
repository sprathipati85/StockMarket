package com.stockmarket.simple.formula.impl;

import java.util.List;

import com.stockmarket.simple.formula.IGeometricMean;

/*
 * Calculate GeometricMean
 * 
 */
public final class GeometricMean implements IGeometricMean {

    private final List<Double> stockPrices;

    public GeometricMean(List<Double> stockPriceList) {
        this.stockPrices = stockPriceList;
    }

    public List<Double> getPriceList() {
        return stockPrices;
    }

    public Double calculate() {
        double geometricMean = 1.0;

        for (Double price : this.stockPrices) {
            geometricMean *= price;
        }
        return Math.pow(geometricMean, 1.0 / stockPrices.size());
    }
}
