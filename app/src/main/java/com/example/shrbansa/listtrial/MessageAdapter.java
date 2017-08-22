package com.example.shrbansa.listtrial;

/**
 * Created by shrbansa on 8/21/17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shrbansa.listtrial.model.Message;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

	private List<Message> moviesList;

	public class MyViewHolder extends RecyclerView.ViewHolder {
		public TextView title, year, genre;

		public MyViewHolder(View view) {
			super(view);
			title = (TextView) view.findViewById(R.id.title);
//			genre = (TextView) view.findViewById(R.id.genre);
//			year = (TextView) view.findViewById(R.id.year);
		}
	}


	public MessageAdapter (List<Message> moviesList) {
		this.moviesList = moviesList;
	}

	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.item_row, parent, false);

		return new MyViewHolder(itemView);
	}


	@Override
	public void onBindViewHolder(MyViewHolder holder, int position) {
		Message msg = moviesList.get(position);
		holder.title.setText(msg.getMessage());
//		holder.genre.setText(movie.getGenre());
//		holder.year.setText(movie.getYear());
	}

	@Override
	public int getItemCount() {
		return moviesList.size();
	}
}