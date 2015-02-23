package com.example.victor.naval_war;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ResourceBundle;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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





    public void setbarcio(View r){

        Intent NI=getIntent();
        Bundle datos=NI.getExtras();
        boolean bool[]=datos.getBooleanArray("b");

        //TextView txt=(TextView)findViewById(R.id.textView);
        //txt.setText("Naves Restantes: "+naves);
        ImageButton btn=(ImageButton)r;
       /* if (naves>0){
            naves=naves-1;*/
            if (r.getId()==R.id.b11){
                if (bool[0]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b12){
                if (bool[1]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b13){
                if (bool[2]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b14){
                if (bool[3]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b15){
                if (bool[4]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b21){
                if (bool[5]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b22){
                if (bool[6]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                };
            }
            if (r.getId()==R.id.b23){
                if (bool[7]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b24){
                if (bool[8]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b25){
                if (bool[9]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b31){
                if (bool[10]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b32){
                if (bool[11]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b33){
                if (bool[12]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b34){
                if (bool[13]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b35){
                if (bool[14]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b41){
                if (bool[15]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b42){
                if (bool[16]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b43){
                if (bool[17]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b44){
                if (bool[18]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b45){
                if (bool[19]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b51){
                if (bool[20]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b52){
                if (bool[21]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b53){
                if (bool[22]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b54){
                if (bool[23]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }
            if (r.getId()==R.id.b55){
                if (bool[24]==true){
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.bom));
                }
                else {
                    btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.none));
                }
            }

        /*}
        else {
            Toast.makeText(getApplicationContext(),"Naves agotadas!!!!!",Toast.LENGTH_SHORT).show();
        }*/

        //ese_we.setBackground(getResources().getDrawable(R.drawable.images_duckduckgo_com));

    }
}
