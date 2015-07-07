package com.example.esic.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;


public class MuseumPrototype extends ActionBarActivity {

    /********************************/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_museum_prototype, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /********************************/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.home:
                Intent un = new Intent(this, MuseumPrototype.class);
                un.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(un);
                return true;

            case R.id.gi:
                Intent intent = new Intent(this, vue2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;

            case R.id.event:
                Intent deux = new Intent(this, vue3.class);
                deux.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(deux);
                return true;


            case R.id.tour:
                Intent trois = new Intent(this, vue4.class);
                trois.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(trois);
                return true;

            case R.id.info:
                Intent quatre = new Intent(this, vue5.class);
                quatre.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(quatre);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    /********************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_prototype);


        /*******/
        final Button premierboutton = (Button) findViewById(R.id.premier);

        premierboutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumPrototype.this, vue2.class);
                startActivity(intent);
            }
        });
        /*******/


        final Button secondboutton = (Button) findViewById(R.id.second);

        secondboutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MuseumPrototype.this, vue3.class);
                startActivity(intent);
            }
        });
        /*******/
        final Button troisiemeboutton = (Button) findViewById(R.id.troisieme);

        troisiemeboutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MuseumPrototype.this, vue4.class);
                startActivity(intent);
            }
        });
        /*******/

        final Button quatriemeboutton = (Button) findViewById(R.id.quatrieme);

        quatriemeboutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MuseumPrototype.this, vue5.class);
                startActivity(intent);
            }
        });
        /*******/
    }
    /********************************/
}

    /*
    *
    package com.example.esic.barremenu;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class barremenu extends ActionBarActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_barremenu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.gi:
                    return true;

            case R.id.event:
                    // Comportement du bouton "Recherche"
                    return true;

            case R.id.tour:
                    // Comportement du bouton "Recherche"
                    return true;

            case R.id.info:
                    // Comportement du bouton "Recherche"
                    return true;

            default:
                    return super.onOptionsItemSelected(item);
                                            }
                                            }

                    }
*/


