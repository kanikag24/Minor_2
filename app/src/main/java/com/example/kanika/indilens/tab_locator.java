package com.example.kanika.indilens;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.kanika.indilens.MainActivity.mViewPager;


public class tab_locator extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_locator, container, false);
        Button locbtn = (Button) rootView.findViewById(R.id.locbtn);
        locbtn.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(),MapsActivity.class);
        startActivity(intent);
    }
}