package com.qtc.getloan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TermCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_condition);
        new Loadads().interstitialAdLoad(this);
        new Loadads().adsBanner(findViewById(R.id.adViewStep14));
        new Loadads().adsBanner(findViewById(R.id.adViewStep15));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        parms.setHome(true);
    }
}