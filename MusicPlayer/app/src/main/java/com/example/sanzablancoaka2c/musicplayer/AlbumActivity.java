package com.example.sanzablancoaka2c.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Find the Button for artist for the album category
        Button artistButton = (Button) findViewById(R.id.artistButton);

        // Set a click listener on that Button
        artistButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist Button is clicked on
            @Override
            public void onClick(View view) {
                Intent artistButtonIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(artistButtonIntent);
            }
        });

        // Find the Button for song for the album category
        Button songButton = (Button) findViewById(R.id.songButton);

        // Set a click listener on that Button
        songButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song Button is clicked on
            @Override
            public void onClick(View view) {
                Intent songButtonIntent = new Intent(AlbumActivity.this, SongActivity.class);
                startActivity(songButtonIntent);
            }
        });

        // Find the Button for library for the album category
        Button libraryButton = (Button) findViewById(R.id.libraryButton);

        // Set a click listener on that Button
        libraryButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library Button is clicked on
            @Override
            public void onClick(View view) {
                Intent libraryButtonIntent = new Intent(AlbumActivity.this, MainActivity.class);
                startActivity(libraryButtonIntent);
            }
        });

    }
}
