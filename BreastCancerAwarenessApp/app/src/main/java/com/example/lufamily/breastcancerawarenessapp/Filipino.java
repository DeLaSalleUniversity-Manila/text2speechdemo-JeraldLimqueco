package com.example.lufamily.breastcancerawarenessapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class Filipino extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipino);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0)
                {
                    Intent overviewF = new Intent(getApplicationContext(), OverviewAndFactsF.class);
                    startActivity(overviewF);
                }

                else if(position == 1)
                {
                    Intent symptomsF = new Intent(getApplicationContext(), SymptomsAndTypesF.class);
                    startActivity(symptomsF);
                }

                else if(position == 2)
                {
                    Intent diagnosisF = new Intent(getApplicationContext(), DiagnosisAndTestsF.class);
                    startActivity(diagnosisF);
                }

                else if(position == 3)
                {
                    Intent treatmentF = new Intent(getApplicationContext(), TreatmentAndCareF.class);
                    startActivity(treatmentF);
                }

                else if(position == 4)
                {
                    Intent livingF = new Intent(getApplicationContext(), LivingAndManagingF.class);
                    startActivity(livingF);
                }

                else if(position == 5)
                {
                    Intent supportF = new Intent(getApplicationContext(), SupportAndResourcesF.class);
                    startActivity(supportF);
                }
            }
        };
        ListView listViewE = (ListView) findViewById(R.id.listViewFil);
        listViewE.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_filipino, menu);
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
