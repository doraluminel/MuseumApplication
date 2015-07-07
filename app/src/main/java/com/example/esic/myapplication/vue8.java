package com.example.esic.myapplication;

import android.os.Bundle;
import android.view.Menu;


public class vue8 extends MuseumPrototype {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vue8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_museum_prototype, menu);
        return true;
    }

}