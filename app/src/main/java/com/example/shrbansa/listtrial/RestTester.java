package com.example.shrbansa.listtrial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RestTester extends AppCompatActivity
{
	private static String TAG = "HACK";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rest_tester);

		Button testTag = (Button)findViewById(R.id.test_tag);
		testTag.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.d(TAG, "tagtest");
				// Code here executes on main thread after user presses button
			}
		});

		Button testSearch = (Button)findViewById(R.id.test_search);
		testSearch.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.d(TAG, "searchtest");
				// Code here executes on main thread after user presses button
			}
		});
	}
}
