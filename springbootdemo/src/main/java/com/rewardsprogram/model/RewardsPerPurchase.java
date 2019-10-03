package com.rewardsprogram.model;

import java.math.BigDecimal;

public class RewardsPerPurchase {
	int id;
	BigDecimal txnAmount;
	long points;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(BigDecimal txnAmount) {
		this.txnAmount = txnAmount;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}	
	
	

}
