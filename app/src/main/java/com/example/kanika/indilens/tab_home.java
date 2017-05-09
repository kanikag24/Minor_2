package com.example.kanika.indilens;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.kanika.indilens.MainActivity.mViewPager;


public class tab_home extends Fragment {

    private Items[] items = {
            new Items("Image Translator", R.drawable.ocr),
            new Items("Text Translator", R.drawable.translator),
            new Items("Navigator", R.drawable.locator),
            new Items("To-Do List", R.drawable.check1),

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_home, container, false);

        GridView gridView = (GridView) rootView.findViewById(R.id.gridView);

        ImageAdapter imageAdapter = new ImageAdapter(getActivity(),items);

        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:
                        mViewPager.setCurrentItem(0,true);

                    case 1:
                        mViewPager.setCurrentItem(1,true);

                    case 2:
                        mViewPager.setCurrentItem(2,true);

                    case 3:
                        mViewPager.setCurrentItem(3,true);

                    default:
                        return;
                }

            }
        });

        return rootView;
    }

}

