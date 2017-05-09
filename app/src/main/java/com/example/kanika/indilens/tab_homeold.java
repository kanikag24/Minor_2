/*package com.example.kanika.indilens;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Kanika on 5/7/17.
 */


/*


public class tab_homeold extends Fragment {

    GridView gridView;

    String[] subs = {"\nImage Translator","Text Translator", "Navigator","To-Do List"};

    int[] imageId = {
            R.drawable.ocr,
            R.drawable.translator,
            R.drawable.locator,
            R.drawable.check1
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_home, container, false);

        Grid adapter = new Grid(getActivity(),subs,imageId);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridView);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "You clicked at" + subs[+position], Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }


}*/