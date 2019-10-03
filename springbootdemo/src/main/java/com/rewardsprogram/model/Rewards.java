package com.rewardsprogram.model;

import java.util.List;

public class Rewards {
	int id;
	long totalpoints;	
	List<RewardsPerPurchase> rewardsList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTotalpoints() {
		return totalpoints;
	}

	public void setTotalpoints(long totalpoints) {
		this.totalpoints = totalpoints;
	}

	public List<RewardsPerPurchase> getRewardsList() {
		return rewardsList;
	}

	public void setRewardsList(List<RewardsPerPurchase> rewardsList) {
		this.rewardsList = rewardsList;
	}
	
	
	

}
