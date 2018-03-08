package com.example.hossam.musicalstructure;

/**
 * Created by hossam on 3/8/18.
 */

public class Tile
{
    private String name;
    private String artist;
    private int imageResourceID;

    public Tile(String name, String artist, int imageResourceID) {
        this.name = name;
        this.artist = artist;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}
