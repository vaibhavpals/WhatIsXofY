package com.example.vaibhav.whatisxofy;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    TextView resultTxt;
    EditText percentEditTxt;
    EditText NumberEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button calculateBtn = (Button) findViewById(R.id.calcButton);
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float percentValue = Float.parseFloat(((EditText) findViewById(R.id.percentEditTxt))
                        .getText().toString());
                float dec = percentValue / 100;
                float resultValue = dec * Float.parseFloat(((EditText)
                        findViewById(R.id.numberEditTxt)).getText().toString());
                resultTxt = (TextView) findViewById(R.id.resultTxt);
                resultTxt.setText(Float.toString(resultValue));
            }
        });
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
}
