package com.example.alc40phase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = findViewById(R.id.id_button_01);
        button2 = findViewById(R.id.id_button_02);

        Button buttonArray[] = new Button[]{ button1, button2};

        for(Button b: buttonArray){
            b.setOnClickListener(this);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        selectActivity((Button) v );
    }

    private void selectActivity(Button button) {
        //Display ALC site if button1 is clicked;ie, run Main2ActivityB
        if(button == button1){
            startActivity(new Intent(MainActivity.this, Main2ActivityB.class) );
        }

        //Display profile information if button2 is clicked; ie run Main3ActivityC
        else if(button == button2){
            startActivity(new Intent(MainActivity.this, Main3ActivityC.class) );
        }
    }
}
