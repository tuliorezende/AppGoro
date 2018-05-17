package com.example.tulior.appgoro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessGoToBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_go_to_beer);
    }

    public void NavigateToBeerOptions(View v) {
        Intent intent = new Intent(this, BeerOptionsActivity.class);
        startActivity(intent);

    }
}
