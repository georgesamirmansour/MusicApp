package com.example.gogos.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PayPal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_pal);
        openAlbumsActivity();
        openListArtistsActivity();
        openNowPlayingActivity();
        openPlayListsActivity();
    }

    public void openPlayListsActivity() {
        TextView playList = (TextView) findViewById(R.id.play_lists_id);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(PayPal.this, PlayLists.class);
                startActivity(playListIntent);
            }
        });
    }

    public void openNowPlayingActivity() {
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_id);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(PayPal.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }

    public void openListArtistsActivity() {
        TextView listArtists = (TextView) findViewById(R.id.list_artists_id);
        listArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listArtistsIntent = new Intent(PayPal.this, ListArtists.class);
                startActivity(listArtistsIntent);
            }
        });
    }

    public void openAlbumsActivity() {
        TextView albums = (TextView) findViewById(R.id.albums_id);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(PayPal.this, Albums.class);
                startActivity(albumsIntent);
            }
        });
    }
}
