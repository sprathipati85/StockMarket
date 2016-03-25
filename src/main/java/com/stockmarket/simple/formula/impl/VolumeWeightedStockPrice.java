package com.stockmarket.simple.formula.impl;

import java.util.List;

import com.stockmarket.simple.bean.Trade;
import com.stockmarket.simple.formula.IVolumeWeightedStockPrice;

/*
 *  Volume Weighted Stock Price
 */

public class VolumeWeightedStockPrice implements IVolumeWeightedStockPrice {

	public Double calculate(List<Trade> tradedPrices) {
		Double sumOfpricesPerQuantities = 0.0;
        Double sumOfQuantities = 0.0;
    	
        for (Trade price : tradedPrices) {
            sumOfpricesPerQuantities += price.getTradedPrice() * price.getTradedQuantity();
            sumOfQuantities += price.getTradedQuantity();
        }
        return sumOfpricesPerQuantities / sumOfQuantities;
	}
}

