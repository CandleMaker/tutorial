package com.example.mj.fragmentprotoype2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OptionsDetailedFragment extends Fragment {

    public OptionsDetailedFragment(){
        //
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_options_detailed_fragment, container, false);
        return rootView;
    }
}
