package com.example.victor.naval_war;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean[] barcos=new boolean[23];
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
            if (r.getId()==R.id.b22){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[6]=true;
            }
            if (r.getId()==R.id.b23){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[6]=true;
            }
            if (r.getId()==R.id.b24){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[7]=true;
            }
            if (r.getId()==R.id.b25){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[8]=true;
            }
            if (r.getId()==R.id.b31){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[9]=true;
            }
            if (r.getId()==R.id.b32){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[10]=true;
            }
            if (r.getId()==R.id.b33){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[11]=true;
            }
            if (r.getId()==R.id.b34){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[12]=true;
            }
            if (r.getId()==R.id.b35){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[13]=true;
            }
            if (r.getId()==R.id.b41){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[14]=true;
            }
            if (r.getId()==R.id.b42){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[15]=true;
            }
            if (r.getId()==R.id.b43){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[16]=true;
            }
            if (r.getId()==R.id.b44){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[17]=true;
            }
            if (r.getId()==R.id.b45){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[18]=true;
            }
            if (r.getId()==R.id.b51){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[19]=true;
            }
            if (r.getId()==R.id.b52){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[20]=true;
            }
            if (r.getId()==R.id.b53){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[21]=true;
            }
            if (r.getId()==R.id.b54){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[22]=true;
            }
            if (r.getId()==R.id.b55){
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.partisannew));
                btn.setClickable(false);
                barcos[23]=true;
            }

        }
        else {
            Toast.makeText(getApplicationContext(),"Naves agotadas!!!!!",Toast.LENGTH_SHORT).show();
        }

        //ese_we.setBackground(getResources().getDrawable(R.drawable.images_duckduckgo_com));

    }


    public void newventana(View r){
        Intent ventana=new Intent(this,MainActivity2Activity.class);
        if (naves==0){
            ventana.putExtra("b",barcos);
            startActivity(ventana);
        }
        else{
            Toast.makeText(getApplicationContext(),"Aun te quedan "+naves+" naves!!!!",Toast.LENGTH_SHORT).show();
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
}
