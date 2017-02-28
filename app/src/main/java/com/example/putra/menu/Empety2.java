package com.example.putra.menu;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Empety2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_empety2, container, false);
        String[] list ={"A","B","C","D","E","F","G","H","i","j"};
        ListView listView = (ListView) rootView.findViewById(R.id.listview2);
        ArrayAdapter<String> listadapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(listadapter);
        return rootView;
    }
}
