package com.example.mj.fragmentprotoype2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.fragment_container_1, new OptionsFragment())
                    .commit();

            getFragmentManager().beginTransaction()
                    .add(R.id.fragment_container_2, new OptionsDetailedFragment())
                    .commit();
        }
    }
}
