package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GenreSearchResultActivity extends AppCompatActivity {

    @BindView(R.id.button_show_album_activity)
    Button buttonAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_search_result);
        ButterKnife.bind(this);

        buttonAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(GenreSearchResultActivity.this, AlbumActivity
                        .class);
                startActivity(intentAlbum);
            }
        });
    }
}
