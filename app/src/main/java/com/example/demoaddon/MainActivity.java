package com.example.demoaddon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ZoomageView zv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        zv = findViewById(R.id.myZoomageView);

//        iv.setImageResource(R.mipmap.ic_launcher);

        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(zv);

    }
}