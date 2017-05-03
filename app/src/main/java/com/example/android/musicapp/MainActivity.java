package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the albums category
        TextView numbers = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the artists category
        TextView family = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the songs category
        TextView colors = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the top songs category
        TextView phrases = (TextView) findViewById(R.id.top_songs);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, TopSongs.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
