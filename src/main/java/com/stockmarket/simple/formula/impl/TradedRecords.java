package com.stockmarket.simple.formula.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stockmarket.simple.bean.Trade;

/*
 * Get the list of all stocks traded within particular time frame
 */
public class TradedRecords {
	
	public List<Trade> getTradeRecordsByTime(List<Trade> tradedStocks, int minutes) {
		List<Trade> result = new ArrayList<Trade>();

		Date date = new Date();
		for (Trade tradedStock : tradedStocks) {
			if (date.getTime() - tradedStock.getTradedTimeStamp().getTime() <= minutes * 60 *1000) {
				result.add(tradedStock);
			}
		}
		return result;
	}

}
