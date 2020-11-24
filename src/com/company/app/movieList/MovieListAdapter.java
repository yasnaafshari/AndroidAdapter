package com.company.app.movieList;

import com.company.android.recycler.RecyclerView;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListViewHolder> {
    List<Movie> movieList;

    public MovieListAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }


    @Override
    public MovieListViewHolder createViewHolder(String itemViewType) {
        return new MovieListViewHolder();
    }

    @Override
    public void setUpViewHolder(MovieListViewHolder viewHolder, int position) {
        System.out.println("setup view holder " + viewHolder);
    }

    @Override
    public int itemCount() {
        return movieList.size();
    }

    @Override
    public String itemViewType(int position) {
        if (position < 10) {
            return "movie";
        } else {
            return "suggestion";
        }
    }
}
