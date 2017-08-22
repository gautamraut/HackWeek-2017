package com.example.shrbansa.listtrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import com.example.shrbansa.listtrial.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MessageAdapter.MessageItemSelector{

	private List<Message> movieList = new ArrayList<>();
	private RecyclerView recyclerView;

	private MessageAdapter mAdapter;
	private EditText finalMessageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		finalMessageView = (EditText)findViewById(R.id.finalText);
		finalMessageView.setMovementMethod(new ScrollingMovementMethod());

		recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

		mAdapter = new MessageAdapter(movieList, this);
		RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
		recyclerView.setLayoutManager(mLayoutManager);
		recyclerView.setItemAnimator(new DefaultItemAnimator());
		recyclerView.setAdapter(mAdapter);

		prepareMovieData();
	}

	private void prepareMovieData() {
		Message movie = new Message("Mad Max: Fury RoadThis is testdata abd a lot of data bla bla blaMad Max: Fury RoadThis is testdata abd a lot of data bla bla blaMad Max: Fury RoadThis is testdata abd a lot of data bla bla blaMad Max: Fury RoadThis is testdata abd a lot of data bla bla bla", "Action & Adventure", "2015");
		movieList.add(movie);

		movie = new Message("Inside Out", "Animation, Kids & Family", "2015");
		movieList.add(movie);

		movie = new Message("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
		movieList.add(movie);

		movie = new Message("Shaun the Sheep", "Animation", "2015");
		movieList.add(movie);

		movie = new Message("The Martian", "Science Fiction & Fantasy", "2015");
		movieList.add(movie);

		movie = new Message("Mission: Impossible Rogue Nation", "Action", "2015");
		movieList.add(movie);

		movie = new Message("Up", "Animation", "2009");
		movieList.add(movie);

		movie = new Message("Star Trek", "Science Fiction", "2009");
		movieList.add(movie);

		movie = new Message("The LEGO Movie", "Animation", "2014");
		movieList.add(movie);

		movie = new Message("Iron Man", "Action & Adventure", "2008");
		movieList.add(movie);

		movie = new Message("Aliens", "Science Fiction", "1986");
		movieList.add(movie);

		movie = new Message("Chicken Run", "Animation", "2000");
		movieList.add(movie);

		movie = new Message("Back to the Future", "Science Fiction", "1985");
		movieList.add(movie);

		movie = new Message("Raiders of the Lost Ark", "Action & Adventure", "1981");
		movieList.add(movie);

		movie = new Message("Goldfinger", "Action & Adventure", "1965");
		movieList.add(movie);

		movie = new Message("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
		movieList.add(movie);

		movie = new Message("The LEGO Movie", "Animation", "2014");
		movieList.add(movie);

		movie = new Message("Iron Man", "Action & Adventure", "2008");
		movieList.add(movie);

		movie = new Message("Aliens", "Science Fiction", "1986");
		movieList.add(movie);

		movie = new Message("Chicken Run", "Animation", "2000");
		movieList.add(movie);

		movie = new Message("Back to the Future", "Science Fiction", "1985");
		movieList.add(movie);

		movie = new Message("Raiders of the Lost Ark", "Action & Adventure", "1981");
		movieList.add(movie);

		movie = new Message("Goldfinger", "Action & Adventure", "1965");
		movieList.add(movie);

		movie = new Message("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
		movieList.add(movie);
		movie = new Message("Aliens", "Science Fiction", "1986");
		movieList.add(movie);

		movie = new Message("Chicken Run", "Animation", "2000");
		movieList.add(movie);

		movie = new Message("Back to the Future", "Science Fiction", "1985");
		movieList.add(movie);

		movie = new Message("Raiders of the Lost Ark", "Action & Adventure", "1981");
		movieList.add(movie);

		movie = new Message("Goldfinger", "Action & Adventure", "1965");
		movieList.add(movie);

		movie = new Message("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
		movieList.add(movie);

		mAdapter.notifyDataSetChanged();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
			case R.id.test_api:
				startRestTestActivity();
				return true;
			case R.id.add_newItem:
				handleItemAddition("Mad Max: Fury RoadThis is testdata abd a lot of data bla bla blaMad Max: Fury RoadThis is test");
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	private void startRestTestActivity()
	{
		Intent intent = new Intent(this, RestTester.class);
		startActivity(intent);
	}


	private void handleItemAddition(String message){
		Message movie = new Message(message, "Action & Adventure", "2015");
		movieList.add(movie);
		mAdapter.notifyDataSetChanged();
	}

	@Override
	public void MessageItemSelected(String message, boolean isAccepted, int position)
	{
		movieList.remove(position);
		mAdapter.notifyDataSetChanged();
		if(isAccepted) {
			finalMessageView.append(message);
		}
	}
}
