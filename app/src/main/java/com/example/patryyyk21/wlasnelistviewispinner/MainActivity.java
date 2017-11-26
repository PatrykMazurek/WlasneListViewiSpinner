package com.example.patryyyk21.wlasnelistviewispinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // przypisanie id kontrolek
        ListView listViewCountry = (ListView)findViewById(R.id.listFruits);
        Spinner spinnerCountry = (Spinner)findViewById(R.id.spinner_country);

        final ArrayList<Country> countryList = new ArrayList<Country>();
        countryList.add(new Country(R.drawable.flag_of_poland, "Polska", 312679, "Warszawa"));
        countryList.add(new Country(R.drawable.flag_of_spain,"Hiszpania", 504645, "Madryt"));
        countryList.add(new Country(R.drawable.flag_of_france,"Francja", 643801, "Paryż"));

        // ListView
        MyBaseAdapter adapter = new MyBaseAdapter(this, countryList);
        listViewCountry.setAdapter(adapter);

        // Sinner
        MyArrayAdapter sAdapter = new MyArrayAdapter(this, R.layout.my_spinner_item, countryList);
        spinnerCountry.setAdapter(sAdapter);

        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tvC2 = (TextView)findViewById(R.id.tVCountryName2);
                //Toast.makeText(getApplicationContext() , tvC2.getText().toString() ,Toast.LENGTH_LONG).show();
                // wyświetlenie informacji pobranych z obiektu Country
                Toast.makeText(getApplicationContext() , getString(R.string.surface) + " " + countryList.get(i).getSurface() ,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext() , getString(R.string.capitol) + " " + countryList.get(i).getCapitol() ,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
