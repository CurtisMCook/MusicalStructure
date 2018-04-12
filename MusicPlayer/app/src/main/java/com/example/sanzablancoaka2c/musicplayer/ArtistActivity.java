package com.example.sanzablancoaka2c.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Find the Button for album for the artist category
        Button albumButton = (Button) findViewById(R.id.albumButton);

        // Set a click listener on that Button
        albumButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album Button is clicked on
            @Override
            public void onClick(View view) {
                Intent albumButtonIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumButtonIntent);
            }
        });

        // Find the Button for song for the artist category
        Button songButton = (Button) findViewById(R.id.songButton);

        // Set a click listener on that Button
        songButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song Button is clicked on
            @Override
            public void onClick(View view) {
                Intent songButtonIntent = new Intent(ArtistActivity.this, SongActivity.class);
                startActivity(songButtonIntent);
            }
        });

        // Find the Button for library for the artist category
        Button libraryButton = (Button) findViewById(R.id.libraryButton);

        // Set a click listener on that Button
        libraryButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library Button is clicked on
            @Override
            public void onClick(View view) {
                Intent libraryButtonIntent = new Intent(ArtistActivity.this, MainActivity.class);
                startActivity(libraryButtonIntent);
            }
        });
    }
}
