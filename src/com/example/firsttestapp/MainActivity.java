package com.example.firsttestapp;

//import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	private GameController gameController;
	private GameModel gameModel;
	private TextView foodTextView, woodTextView, metalTextView;	
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		gameController = new GameController(this);
		gameModel = gameController.getGameModel();
		
		foodTextView = (TextView) findViewById(R.id.food_counter);
		woodTextView = (TextView) findViewById(R.id.wood_counter);
		metalTextView = (TextView) findViewById(R.id.metal_counter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public void foodButtonClick(View view) {
		gameController.foodButtonClick();
	}
	
	public void woodButtonClick(View view) {
		gameController.woodButtonClick();
	}
	
	public void metalButtonClick(View view) {
		gameController.metalButtonClick();
	}
	
	public void refreshViews(){
		foodTextView.setText("Food: " + String.valueOf(gameModel.getFoodAmount()));
		woodTextView.setText("Wood: " + String.valueOf(gameModel.getWoodAmount()));
		metalTextView.setText("Metal: " + String.valueOf(gameModel.getMetalAmount()));		
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_search:
				//openSearch();
				return true;
			case R.id.action_settings:
				//openSettings();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
}
