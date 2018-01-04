package com.dev.chris.cryptonite;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cryptonite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptonite);

        FragmentManager fm = getSupportFragmentManager();
        CryptoFragment cryptoFragment = new CryptoFragment();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.crypto_fragment_container, cryptoFragment, "crypto");
        ft.commit();

    }
}
