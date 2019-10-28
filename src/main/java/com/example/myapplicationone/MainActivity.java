package com.example.myapplicationone;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        final TextView textView = findViewById(R.id.textView);

        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("yeah,button one is working!");
            }
        });

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button2 :

                Intent it = new Intent(MainActivity.this , second_activity.class);
                startActivity(it);
                break;

            case R.id.button3 :

                Intent it1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 1246634664"));
                startActivity(it1);
                break;

            case R.id.button4 :

                Intent it2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: "));
                startActivity(it2);
                break;

            case R.id.button5 :

                Intent it3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://whyprakharwhy.wordpress.com"));
                startActivity(it3);
                break;

            case R.id.button6:

                Intent i1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i1);
                 break;


        }
    }
}
