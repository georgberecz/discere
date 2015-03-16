package com.example.firsttestapp;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class GameView {
	private GameModel gameModel;
	private Activity mainActivity;
	private TextView foodTextView, woodTextView, metalTextView;
	
	public GameView(Activity mainActivity, GameModel gameModel){
		this.mainActivity = mainActivity;
		foodTextView = (TextView) this.mainActivity.findViewById(R.id.food_counter);
		woodTextView = (TextView) this.mainActivity.findViewById(R.id.wood_counter);
		metalTextView = (TextView) this.mainActivity.findViewById(R.id.metal_counter);
	}
	
	
	
	public void refreshViews(){
		foodTextView.setText("Food: " + String.valueOf(gameModel.getFoodAmount()));
		foodTextView.setText("Wood: " + String.valueOf(gameModel.getWoodAmount()));
		foodTextView.setText("Metal: " + String.valueOf(gameModel.getMetalAmount()));
	}
	
}