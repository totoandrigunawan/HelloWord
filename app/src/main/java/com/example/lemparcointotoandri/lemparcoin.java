package com.example.lemparcointotoandri;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class lemparcoin extends Activity implements View.OnClickListener {
    private Button buttonlempar;
    private Button buttonulangi;
    private Button buttonkeluar;
    private Random acak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak= new Random();
        setContentView(R.layout.activity_lemparcoin);
        buttonlempar=(Button)findViewById(R.id.buttonlempar);
        buttonulangi=(Button)findViewById(R.id.buttonulangi);
        buttonkeluar=(Button)findViewById(R.id.buttonkeluar);
        buttonlempar.setOnClickListener(this);
        buttonulangi.setOnClickListener(this);
        buttonkeluar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view==buttonlempar) {
            Log.d("CLICK EVENT", "Lempar button diClik");
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView1);

            if (acak.nextDouble() < 0.5) {
                tw.setText("kepala");
                iw.setImageResource(R.drawable.head);
            } else {
                tw.setText("Cross");
                iw.setImageResource(R.drawable.tail);
            }
            buttonlempar.setVisibility(View.INVISIBLE);
            buttonulangi.setVisibility(View.VISIBLE);
            buttonkeluar.setVisibility(View.VISIBLE);

        } else if (view==buttonulangi) {
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView1);

            buttonlempar.setVisibility(View.VISIBLE);
            buttonulangi.setVisibility(View.INVISIBLE);
            buttonkeluar.setVisibility(View.INVISIBLE);

        }else if (view==buttonkeluar){
            this.finish();
        }
    }
}
