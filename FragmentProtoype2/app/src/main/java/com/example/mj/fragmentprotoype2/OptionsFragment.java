package com.example.mj.fragmentprotoype2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionsFragment extends Fragment {

    public OptionsFragment(){
        //
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {
                "Settings",
                "Option",
                "Other"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.options_fragment_list_item,R.id.options_fragment_list_item,weekForecast);
        View rootView = inflater.inflate(R.layout.options_fragment_class, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.options_fragment_listview);
        listView.setAdapter(mForecastAdapter);
        return rootView;
    }
}
