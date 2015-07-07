package com.example.esic.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class vue4 extends MuseumPrototype {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vue4);


        /*******/
        final Button qrcode = (Button) findViewById(R.id.qrcode);

        qrcode.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vue4.this, vue6.class);
                startActivity(intent);
            }
        });
        /*******/
        final Button floor = (Button) findViewById(R.id.floor);

        floor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vue4.this, vue7.class);
                startActivity(intent);
            }
        });
        /*******/
        final Button floordisab = (Button) findViewById(R.id.floordisab);

        floordisab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vue4.this, vue8.class);
                startActivity(intent);
            }
        });
        /*******/
    }


}