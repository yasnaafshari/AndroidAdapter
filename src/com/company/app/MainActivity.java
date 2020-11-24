package com.company.app;

import com.company.android.Activity;
import com.company.android.recycler.LayoutManager;
import com.company.android.recycler.RecyclerView;
import com.company.app.movieList.Movie;
import com.company.app.movieList.MovieListAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("setup onCreate mainActivity");
        setContentView("main activity");
        RecyclerView recyclerView = new RecyclerView();
        recyclerView.setLayoutManager(new LayoutManager());
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The life ahead"));
        movies.add(new Movie("Disobedience"));
        recyclerView.setAdapter(new MovieListAdapter(movies));
        recyclerView.showList();
    }
}
