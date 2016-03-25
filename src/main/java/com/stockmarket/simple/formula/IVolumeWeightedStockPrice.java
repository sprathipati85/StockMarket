package com.stockmarket.simple.formula;

import java.util.List;

import com.stockmarket.simple.bean.Trade;
import com.stockmarket.simple.exception.InvalidValueException;

public interface IVolumeWeightedStockPrice {

    Double calculate(List<Trade> tradesPrices)throws InvalidValueException;
}
