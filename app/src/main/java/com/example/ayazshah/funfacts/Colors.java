package com.example.ayazshah.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by ayazshah on 3/11/16.
 */
public class Colors {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    public int getColors(){
        String colors;
        Random rand = new Random();
        int difColors = rand.nextInt(mColors.length);
        colors = mColors[difColors];
        int colorsAsint = Color.parseColor(colors);
        return colorsAsint;
    }
}
