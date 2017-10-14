package com.example.gogos.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        openListArtistsActivity();
        openNowPlayingActivity();
        openPlayListsActivity();
        openPayPalActivity();
    }

    public void albumsDescription() {
        TextView family = (TextView) findViewById(R.id.albums_1_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.message) + getString(R.string.albums_description), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void openPlayListsActivity() {
        TextView playList = (TextView) findViewById(R.id.play_lists_id);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(Albums.this, PlayLists.class);
                startActivity(playListIntent);
            }
        });
    }

    public void openNowPlayingActivity() {
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_id);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Albums.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }

    public void openListArtistsActivity() {
        TextView listArtists = (TextView) findViewById(R.id.list_artists_id);
        listArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listArtistsIntent = new Intent(Albums.this, ListArtists.class);
                startActivity(listArtistsIntent);
            }
        });
    }

    public void openPayPalActivity() {
        TextView family = (TextView) findViewById(R.id.payment_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payPalIntent = new Intent(Albums.this, PayPal.class);
                startActivity(payPalIntent);
            }
        });
    }
}
