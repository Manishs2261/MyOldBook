package com.example.manish.oldbook.fragmentclass;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.manish.oldbook.R;


public class Chatt extends Fragment {

    ImageView sendchat;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_chatt, container, false);

        sendchat = view.findViewById(R.id.sendchat);

        sendchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), " development mode ", Toast.LENGTH_SHORT).show();
            }
        });


        return  view;
    }
}