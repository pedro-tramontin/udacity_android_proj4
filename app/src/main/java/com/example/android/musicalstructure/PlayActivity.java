package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayActivity extends AppCompatActivity {

    @BindView(R.id.button_show_artist_activity)
    Button buttonArtist;
    @BindView(R.id.button_show_album_activity)
    Button buttonAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ButterKnife.bind(this);

        buttonArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist = new Intent(PlayActivity.this, ArtistActivity
                        .class);
                startActivity(intentArtist);
            }
        });

        buttonAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(PlayActivity.this, AlbumActivity
                        .class);
                startActivity(intentAlbum);
            }
        });
    }
}
