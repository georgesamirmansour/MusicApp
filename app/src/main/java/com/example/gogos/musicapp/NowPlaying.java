package com.example.gogos.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        detailsOnThisSong();
        openAlbumsActivity();
        openListArtistsActivity();
        openPlayListsActivity();
        openPayPalActivity();
    }

    public void detailsOnThisSong() {
        TextView phrases = (TextView) findViewById(R.id.song_details_id);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.details_message), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void openPlayListsActivity() {
        TextView playList = (TextView) findViewById(R.id.play_lists_id);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(NowPlaying.this, PlayLists.class);
                startActivity(playListIntent);
            }
        });
    }

    public void openListArtistsActivity() {
        TextView listArtists = (TextView) findViewById(R.id.list_artists_id);
        listArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listArtistsIntent = new Intent(NowPlaying.this, ListArtists.class);
                startActivity(listArtistsIntent);
            }
        });
    }

    public void openAlbumsActivity() {
        TextView albums = (TextView) findViewById(R.id.albums_id);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(NowPlaying.this, Albums.class);
                startActivity(albumsIntent);
            }
        });
    }

    public void openPayPalActivity() {
        TextView family = (TextView) findViewById(R.id.payment_id);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payPalIntent = new Intent(NowPlaying.this, PayPal.class);
                startActivity(payPalIntent);
            }
        });
    }
}
