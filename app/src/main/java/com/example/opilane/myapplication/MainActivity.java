package com.example.opilane.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button üks, kaks, kolm, neli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        üks = findViewById(R.id.nupp1);

        üks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String url = "http://tallinnzoo.ee/en";
                Intent zoo = new Intent(Intent.ACTION_VIEW);
                zoo.setData(Uri.parse(url));
                startActivity(zoo);
            }

            {
        }
        public void pildid (View view) {
            Intent intent = new Intent( MainActivity.this, PILDIDACTIVITY.class);
            startActivity(intent);
        }


    