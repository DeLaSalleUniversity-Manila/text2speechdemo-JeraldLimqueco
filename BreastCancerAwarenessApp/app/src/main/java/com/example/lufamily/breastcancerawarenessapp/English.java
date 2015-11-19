package com.example.lufamily.breastcancerawarenessapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class English extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0)
                {
                    Intent overview = new Intent(getApplicationContext(), OverviewAndFacts.class);
                    startActivity(overview);
                }

                else if(position == 1)
                {
                    Intent symptoms = new Intent(getApplicationContext(), SymptomsAndTypes.class);
                    startActivity(symptoms);
                }

                else if(position == 2)
                {
                    Intent diagnosis = new Intent(getApplicationContext(), DiagnosisAndTests.class);
                    startActivity(diagnosis);
                }

                else if(position == 3)
                {
                    Intent treatment = new Intent(getApplicationContext(), TreatmentAndCare.class);
                    startActivity(treatment);
                }

                else if(position == 4)
                {
                    Intent living = new Intent(getApplicationContext(), LivingAndManaging.class);
                    startActivity(living);
                }

                else if(position == 5)
                {
                    Intent support = new Intent(getApplicationContext(), SupportAndResources.class);
                    startActivity(support);
                }
            }
        };
        ListView listViewE = (ListView) findViewById(R.id.listViewEng);
        listViewE.setOnItemClickListener(itemClickListener);
    }

  /*  CallbackManager callbackManager;
    ShareDialog shareDialog;

    public void onClickShare(View v){
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager= CallbackManager.Factoruy.create();
        shareDialog=new ShareDialog(this);

        if(ShareDialog.canShow(ShareLinkContent.class)){
            ShareLinkContent linkContent = new ShareLinkContent.Builder()
                    .setContentTitle("Breast Cancer App")
                    .setContentDescription("This App Raises Awareness on Breast Cancer")
                    .setContentUrl(Uri.parse("https://github.com/DeLaSalleUniversity-Manila/breastcancerawarenessapp-ErvinLu"))
                    .build();
            shareDialog.show(linkContent);
        }
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_english, menu);
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
