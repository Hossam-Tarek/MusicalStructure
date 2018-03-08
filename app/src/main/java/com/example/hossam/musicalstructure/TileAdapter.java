package com.example.hossam.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hossam on 3/8/18.
 */

public class TileAdapter extends ArrayAdapter<Tile>
{
    public TileAdapter(@NonNull Context context, @NonNull List<Tile> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Tile tile = getItem(position);

        TextView name = listItemView.findViewById(R.id.name_text_view);
        name.setText(tile.getName());

        TextView artist = listItemView.findViewById(R.id.artist_text_view);
        artist.setText(tile.getArtist());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(tile.getImageResourceID());

        return listItemView;
    }
}
