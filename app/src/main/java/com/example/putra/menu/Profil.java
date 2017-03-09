package com.example.putra.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }
    public void simpan(View v)
    {
        finish();
    }
}
