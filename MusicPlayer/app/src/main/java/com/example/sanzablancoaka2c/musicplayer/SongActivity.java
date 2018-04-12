package com.example.sanzablancoaka2c.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        // Find the Button for artist for the song category
        Button artistButton = (Button) findViewById(R.id.artistButton);

        // Set a click listener on that Button
        artistButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist Button is clicked on
            @Override
            public void onClick(View view) {
                Intent artistButtonIntent = new Intent(SongActivity.this, ArtistActivity.class);
                startActivity(artistButtonIntent);
            }
        });

        // Find the Button for album for the song category
        Button albumButton = (Button) findViewById(R.id.albumButton);

        // Set a click listener on that Button
        albumButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album Button is clicked on
            @Override
            public void onClick(View view) {
                Intent albumButtonIntent = new Intent(SongActivity.this, AlbumActivity.class);
                startActivity(albumButtonIntent);
            }
        });

        // Find the Button for library for the song category
        Button libraryButton = (Button) findViewById(R.id.libraryButton);

        // Set a click listener on that Button
        libraryButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library Button is clicked on
            @Override
            public void onClick(View view) {
                Intent libraryButtonIntent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(libraryButtonIntent);
            }
        });
    }
}
