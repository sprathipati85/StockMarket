package com.stockmarket.simple.bean;

import java.util.Date;

public class Trade {

/*
 * Trade Bean class
 */
	private Stock stock;
	private Date tradedTimeStamp;
	private Double tradedPrice;
	private Long tradedQuantity;
	
	public Stock getStock() {
		return stock;
	}

	public Date getTradedTimeStamp() {
		return tradedTimeStamp;
	}

	public void setTradedTimeStamp(Date tradedTimeStamp) {
		this.tradedTimeStamp = tradedTimeStamp;
	}

	public Long getTradedQuantity() {
		return tradedQuantity;
	}

	public void setTradedQuantity(Long tradedQuantity) {
		this.tradedQuantity = tradedQuantity;
	}

	
	public Trade(Stock stock, Date tradedTimeStamp, Double tradedPrice, Long tradedQuantity) {
		super();
		this.stock = stock;
		this.tradedTimeStamp = tradedTimeStamp;
		this.tradedPrice = tradedPrice;
		this.tradedQuantity = tradedQuantity;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	public Double getTradedPrice() {
		return tradedPrice;
	}
	
	public void setTradedPrice(Double tradedPrice) {
		this.tradedPrice = tradedPrice;
	}
	
	@Override
    public String toString() {
		return "Trade [ Stock = "+this.stock
				+ ", Shares Quantity = "+this.tradedQuantity
				+ ", Traded Price = "+this.tradedPrice
				+ ", Time Stamp = "+this.tradedTimeStamp
				+ " ]";
    }
}