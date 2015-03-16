package com.example.firsttestapp;

public class GameModel {
	private int foodAmount = 0;
	private int woodAmount = 0;
	private int metalAmount = 0;
	
	
	
	public void setFoodAmount(int foodAmount) {
		this.foodAmount = foodAmount;
	}
	
	public void setWoodAmount(int woodAmount) {
		this.woodAmount = woodAmount;
	}

	public void setMetalAmount(int metalAmount) {
		this.metalAmount = metalAmount;
	}
	
	public int getFoodAmount(){
		return foodAmount;
	}
	
	public int getWoodAmount() {
		return woodAmount;
	}

	public int getMetalAmount() {
		return metalAmount;
	}
	
}
