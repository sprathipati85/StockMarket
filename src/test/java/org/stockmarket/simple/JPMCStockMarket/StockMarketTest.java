package org.stockmarket.simple.JPMCStockMarket;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import com.stockmarket.simple.bean.Stock;
import com.stockmarket.simple.bean.StockSymbol;
import com.stockmarket.simple.bean.Trade;
import com.stockmarket.simple.exception.InvalidValueException;
import com.stockmarket.simple.formula.IDividendYield;
import com.stockmarket.simple.formula.IGeometricMean;
import com.stockmarket.simple.formula.IPERatio;
import com.stockmarket.simple.formula.IVolumeWeightedStockPrice;
import com.stockmarket.simple.formula.impl.CommonDividendYield;
import com.stockmarket.simple.formula.impl.GeometricMean;
import com.stockmarket.simple.formula.impl.PERatio;
import com.stockmarket.simple.formula.impl.TradedRecords;
import com.stockmarket.simple.formula.impl.VolumeWeightedStockPrice;

public class StockMarketTest {

@Mock
private IGeometricMean geometricMean;
@Mock
private IDividendYield dividendYield;
@Mock
private IPERatio peRatio;
@Mock
private IVolumeWeightedStockPrice volumeWeightedStockPrice;

@Mock
private TradedRecords tradedRecords;


@Test
public void testGeometricMeanFormula(){
		List<Double> stockPrices = new ArrayList<Double>(2);
		stockPrices.add(9.0);
		stockPrices.add(9.0);
		
		geometricMean = new GeometricMean(stockPrices);
		double actual = geometricMean.calculate();
		assertEquals(Math.pow(9.0 * 9.0, 1.0/2.0), actual, 0.0);
	}

@Test
public void testPERatioPositive() {
    peRatio = new PERatio(512.0,2.0);
	double actual = peRatio.calculate();
	
    assertEquals(512.0/2.0, actual,0.0);
}

@Test(expected = NullPointerException.class)
public void throwNullPointerExceptionPERatio() {
	peRatio = new PERatio(null,0.0);
	peRatio.calculate();
}

@Test
public void testDividendYieldPositive() {
	dividendYield = new CommonDividendYield(90.0, 2.0);
    assertEquals(45.0, dividendYield.calculate(), 0.0);
}

@Test
public void testWeightedVolumePositive() {
	volumeWeightedStockPrice = new VolumeWeightedStockPrice();
	List<Trade> tradePrices = new ArrayList<Trade>(); 
	Stock stock1 = new Stock();
	stock1.setStockSymbol(StockSymbol.ALE.toString());
	stock1.setParValue(100.0);
	Trade trade1 = new Trade(stock1, new Date(), 100.0, 10l);
	tradePrices.add(trade1 );

	assertEquals(100, volumeWeightedStockPrice.calculate(tradePrices), 0.0);
}

//To do - to implement the exception functionality
@Test(expected = InvalidValueException.class)
@Ignore
public void invalidExceptionPERatio() {
	peRatio = new PERatio(0.0,0.0);
	peRatio.calculate();
}

@Test
public void tradedRecords() {
	List<Trade> tradePrices = new ArrayList<Trade>(); 
	Stock stock1 = new Stock();
	stock1.setStockSymbol(StockSymbol.ALE.toString());
	stock1.setParValue(100.0);
	Trade trade1 = new Trade(stock1, new Date(new Date().getTime() - 20 * 1000 * 60), 100.0, 10l);
	tradePrices.add(trade1 );
	tradedRecords = new TradedRecords();
	assertEquals(tradePrices, tradedRecords.getTradeRecordsByTime(tradePrices, 20));
	}
}
