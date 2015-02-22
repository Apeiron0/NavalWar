package com.example.victor.naval_war;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean[] barcos=new boolean[25];
    int naves=5;

    public void setbarcio(View r){
        //TextView txt=(TextView)findViewById(R.id.textView);
        //txt.setText("Naves Restantes: "+naves);
        ImageButton btn=(ImageButton)r;
        if (naves>0){
            naves=naves-1;
            if (r.getId()==R.id.b11){
                //ImageButton btn=(ImageButton) findViewById(R.id.b11);
                //btn.setBackground(getResources().getDrawable(R.drawable.PartisanNew));
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[0]=true;
            }
            if (r.getId()==R.id.b12){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[1]=true;
            }
            if (r.getId()==R.id.b13){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[2]=true;
            }
            if (r.getId()==R.id.b14){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[3]=true;
            }
            if (r.getId()==R.id.b15){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[4]=true;
            }
            if (r.getId()==R.id.b21){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[5]=true;
            }

        }

        //ese_we.setBackground(getResources().getDrawable(R.drawable.images_duckduckgo_com));

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
