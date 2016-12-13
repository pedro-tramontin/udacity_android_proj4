package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumActivity extends AppCompatActivity {

    @BindView(R.id.button_show_play_activity)
    Button buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        ButterKnife.bind(this);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlay = new Intent(AlbumActivity.this, PlayActivity
                        .class);
                startActivity(intentPlay);
            }
        });
    }
}
