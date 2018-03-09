package com.example.hossam.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView imageView = findViewById(R.id.album_image);
        int imageResourceId = getIntent().getExtras().getInt("imageResourceID");
        imageView.setImageResource(imageResourceId);

        TextView songName = findViewById(R.id.song_name);
        String name = getIntent().getExtras().getString("name");
        songName.setText(name);

        TextView artistName = findViewById(R.id.artist_name);
        String artist = getIntent().getExtras().getString("artist");
        artistName.setText(artist);
    }
}
