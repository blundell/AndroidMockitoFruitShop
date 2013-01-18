package com.blundell.androidmockitofruitshop.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.blundell.androidmockitofruitshop.R;
import com.blundell.androidmockitofruitshop.domain.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FruitShop fruitShop = new FruitShop();
		fruitShop.add(Fruit.ORANGE, 3);

		Auditor auditor = new Auditor();

		int amountOfFruit = auditor.count(fruitShop);

		TextView numberOfFruitTextView = (TextView) findViewById(R.id.main_tv_fruit_count);
		numberOfFruitTextView.setText("Fruit Shop Count: " + amountOfFruit);
	}

}
