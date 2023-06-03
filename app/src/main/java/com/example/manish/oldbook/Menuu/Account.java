package com.example.manish.oldbook.Menuu;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manish.oldbook.R;
import com.example.manish.oldbook.fragmentclass.Manuu;

public class Account extends Fragment {

    TextView reg_us_button;
    FrameLayout accountFramelayout;



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        accountFramelayout = view.findViewById(R.id.accountFramelayout);

        reg_us_button = view.findViewById(R.id.reg_us_button);

        reg_us_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "save successfuly", Toast.LENGTH_SHORT).show();
            }
        });




        return view;
    }



}