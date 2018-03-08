package com.example.hossam.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Tile> tiles = new ArrayList<>();
        tiles.add(new Tile("It Ain't Me", "Kygo & Selena Gomez", R.drawable.it_ain_t_me));
        tiles.add(new Tile("Stay With Me", "Sam Smith", R.drawable.stay_with_me));
        tiles.add(new Tile("Rolling The Deep", "Adele", R.drawable.adele));
        tiles.add(new Tile("Animals", "Martin Garrix", R.drawable.animals));
        tiles.add(new Tile("Fadded", "Alan Walker", R.drawable.faded));
        tiles.add(new Tile("Wake Me Up", "Avicii", R.drawable.wake_me_up));
        tiles.add(new Tile("Blank Space", "Taylor", R.drawable.blank_space));
        tiles.add(new Tile("Set Fire To The Rain", "Adele", R.drawable.adele));
        tiles.add(new Tile("Sucker For Pain", "Lil Wayne, Wiz Khalifa & Imagine Dragons",
                R.drawable.sucker_for_pain));
        tiles.add(new Tile("Am I Wrong", "Nico & Vinz", R.drawable.am_i_wrong));
        tiles.add(new Tile("Born To Die", "Lana Del Rey", R.drawable.born_to_die));
        tiles.add(new Tile("Rather Be", "Jess Glynne", R.drawable.rather_be));
        tiles.add(new Tile("Formidable", "Stromae", R.drawable.formidable));
        tiles.add(new Tile("The Nights", "Avicii", R.drawable.the_nights));
        tiles.add(new Tile("A Love Song", "Kenny Rogers", R.drawable.a_love_song));
        tiles.add(new Tile("I'm Not The Only One", "Sam Smith", R.drawable.i_m_not_the_only_one));
        tiles.add(new Tile("Chandelier", "Sia", R.drawable.chandelier));
        tiles.add(new Tile("Elastic Heart", "Sia", R.drawable.elastic_heart));
        tiles.add(new Tile("Come With Me", "Ricky Martin", R.drawable.come_with_me));
        tiles.add(new Tile("Only Girl (In The World)", "Rihanna", R.drawable.only_girl));

        TileAdapter adapter = new TileAdapter(this, tiles);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
