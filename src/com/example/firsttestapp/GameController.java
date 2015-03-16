package com.example.firsttestapp;

import android.app.Activity;


public class GameController {
	private GameModel gameModel;
	private MainActivity mainActivity;
	
	public GameController(MainActivity activity){
		mainActivity = activity;
		gameModel = new GameModel();
	}
	
	public GameModel getGameModel(){
		return gameModel;
	}
	
	public void foodButtonClick(){
		gameModel.setFoodAmount(gameModel.getFoodAmount()+1);
		mainActivity.refreshViews();
	}

	public void woodButtonClick(){
		gameModel.setWoodAmount(gameModel.getWoodAmount()+1);		
		mainActivity.refreshViews();
	}
	
	public void metalButtonClick(){
		gameModel.setMetalAmount(gameModel.getMetalAmount()+1);
		mainActivity.refreshViews();
	}

}
