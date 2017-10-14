package com.example.gogos.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlayLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_lists);
        playListDescription();
        openNowPlayingActivity();
        openListArtistsActivity();
        openAlbumsActivity();
        openPayPalActivity();
    }

    public void playListDescription() {
        TextView family = (TextView) findViewById(R.id.play_list_1_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.message), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void openNowPlayingActivity() {
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_id);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(PlayLists.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }

    public void openListArtistsActivity() {
        TextView listArtists = (TextView) findViewById(R.id.list_artists_id);
        listArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listArtistsIntent = new Intent(PlayLists.this, ListArtists.class);
                startActivity(listArtistsIntent);
            }
        });
    }

    public void openAlbumsActivity() {
        TextView albums = (TextView) findViewById(R.id.albums_id);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(PlayLists.this, Albums.class);
                startActivity(albumsIntent);
            }
        });
    }

    public void openPayPalActivity() {
        TextView family = (TextView) findViewById(R.id.payment_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payPalIntent = new Intent(PlayLists.this, PayPal.class);
                startActivity(payPalIntent);
            }
        });
    }
}
