package com.example.tulior.appgoro;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class BeerOptionsActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private List<BeerModel> beerModelList = new ArrayList<BeerModel>();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return StaticNavigation.ExecuteBottonNavigation(BeerOptionsActivity.this, item.getItemId());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_options);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        initData();
        HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.horizontal_cycle);
        CarouselAdapter adapter = new CarouselAdapter(beerModelList, this, getBaseContext());
        horizontalInfiniteCycleViewPager.setAdapter(adapter);
    }

    private void initData() {

        BeerModel heineken = new BeerModel();
        heineken.BeerMark = R.mipmap.ic_heineken_logo;
        heineken.BeerExample = R.mipmap.ic_heineken;
        heineken.BeerRating = "4";
        heineken.BeerName = "Cervejaria: Cervejaria Heineken";
        heineken.BeerGroup = "Grupo: Grupo Heineken";
        heineken.BeerStyle = "Estilo: Premium American Lager";
        heineken.BeerAlchoolPercent = "Alcool (%): 5% ABV";
        heineken.BeerActive = "Ativa: SIM";
        heineken.BeerSazonal = "Sazonal: Não é sazonal";
        heineken.BeerTemperature = "Temperatura: 5-7ºC";
        heineken.BeerType = "Copo ideal: Lager (Chppe)";

        BeerModel imperio = new BeerModel();
        imperio.BeerMark = R.mipmap.ic_imperio_logo;
        imperio.BeerExample = R.mipmap.ic_imperio;
        imperio.BeerRating = "2";
        imperio.BeerName = "Cervejaria: Cervejaria Império";
        imperio.BeerGroup = "Grupo: Império";
        imperio.BeerStyle = "Estilo: Premium American Lager";
        imperio.BeerAlchoolPercent = "Alcool (%): 6% ABV";
        imperio.BeerActive = "Ativa: SIM";
        imperio.BeerSazonal = "Sazonal: Não é sazonal";
        imperio.BeerTemperature = "Temperatura: 5-7ºC";
        imperio.BeerType = "Copo ideal: Lager (Chppe)";

        beerModelList.add(heineken);
        beerModelList.add(imperio);

    }

}
