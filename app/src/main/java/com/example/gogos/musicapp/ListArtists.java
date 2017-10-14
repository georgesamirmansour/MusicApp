package com.example.gogos.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ListArtists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_artists);
        artistDescription();
        openAlbumsActivity();
        openNowPlayingActivity();
        openPlayListsActivity();
        openPayPalActivity();
    }

    public void artistDescription() {
        TextView family = (TextView) findViewById(R.id.artist_description_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.message), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void openPlayListsActivity() {
        TextView playList = (TextView) findViewById(R.id.play_lists_id);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(ListArtists.this, PlayLists.class);
                startActivity(playListIntent);
            }
        });
    }

    public void openNowPlayingActivity() {
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_id);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(ListArtists.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }

    public void openAlbumsActivity() {
        TextView albums = (TextView) findViewById(R.id.albums_id);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(ListArtists.this, Albums.class);
                startActivity(albumsIntent);
            }
        });
    }

    public void openPayPalActivity() {
        TextView family = (TextView) findViewById(R.id.payment_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payPalIntent = new Intent(ListArtists.this, PayPal.class);
                startActivity(payPalIntent);
            }
        });
    }
}
