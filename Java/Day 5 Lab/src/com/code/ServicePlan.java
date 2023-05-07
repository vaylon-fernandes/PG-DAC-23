package com.code;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double planCost;

	private ServicePlan(int planCost) {
		this.planCost = planCost;
	}

	public double getPlanCost() {
		return planCost;
	}
	
	@Override 
	public String toString() {
		return name()+" cost "+this.planCost;
	}
}
