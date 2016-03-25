package com.stockmarket.simple.bean;

/*
 * Stock Bean class
 */
public class Stock {
	
	private String stockSymbol;
	private com.stockmarket.simple.bean.StockType StockType;
	private Double lastDividend;
	private Double fixedDividend;
	private Double parValue;
	
	public Stock() {
	}
	
	public Stock(String stockSymbol, com.stockmarket.simple.bean.StockType type, Double lastDividend,
			Double fixedDividend, Double parValue) {
		super();
		this.stockSymbol = stockSymbol;
		this.StockType = type;
		this.lastDividend = lastDividend;
		this.fixedDividend = fixedDividend;
		this.parValue = parValue;
	}


	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public Double getParValue() {
		return parValue;
	}

	public void setParValue(Double parValue) {
		this.parValue = parValue;
	}
	public com.stockmarket.simple.bean.StockType getType() {
		return StockType;
	}

	public void setType(com.stockmarket.simple.bean.StockType type) {
		this.StockType = type;
	}

	public Double getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(Double lastDividend) {
		this.lastDividend = lastDividend;
	}

	public Double getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividen(Double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}
	
	@Override
    public String toString() {
		return "Stock [ Stock Symbol = "+this.stockSymbol
				+ ", Type = "+this.StockType
				+ ", Last Dividend = "+this.lastDividend
				+ ", Fixed Dividend = "+this.fixedDividend
				+ ", Par Value = "+this.parValue
								+ " ]";
    }
}