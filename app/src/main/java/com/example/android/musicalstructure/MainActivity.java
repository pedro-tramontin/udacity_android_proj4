package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_show_search_results_activity)
    Button buttonSearchResults;
    @BindView(R.id.button_show_genres_activity)
    Button buttonGenres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Utils.addOnClickListenerToOpenActivity(buttonSearchResults, this, SearchResultsActivity
                .class, Utils.LEAVE_CALLING_ACTIVITY_OPEN);
        Utils.addOnClickListenerToOpenActivity(buttonGenres, this, GenreSearchResultActivity
                .class, Utils.LEAVE_CALLING_ACTIVITY_OPEN);
    }
}
