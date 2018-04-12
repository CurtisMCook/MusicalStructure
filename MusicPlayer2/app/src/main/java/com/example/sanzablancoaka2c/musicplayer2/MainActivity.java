package com.example.sanzablancoaka2c.musicplayer2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.victory);

        // Find the Button for song for the album category
        Button play = (Button) findViewById(R.id.play_button);

        // Set a click listener on that Button
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song Button is clicked on
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MainActivity.this, "I'm done!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        // Find the Button for song for the album category
        Button pause = (Button) findViewById(R.id.pause_button);

        // Set a click listener on that Button
        pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the song Button is clicked on
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
    }
}
