package com.example.manish.oldbook.fragmentclass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manish.oldbook.Home;
import com.example.manish.oldbook.Menuu.Account;
import com.example.manish.oldbook.Menuu.Help;
import com.example.manish.oldbook.Menuu.LogOut;
import com.example.manish.oldbook.Menuu.Login;
import com.example.manish.oldbook.Menuu.Order;
import com.example.manish.oldbook.Menuu.Reward;
import com.example.manish.oldbook.Menuu.Settings;
import com.example.manish.oldbook.Menuu.Transaction;
import com.example.manish.oldbook.Menuu.WatchList;
import com.example.manish.oldbook.R;


public class Manuu extends Fragment {

ImageView back_manue;
    TextView account,order,transaction,watchlist,offer,Reward,settings,help,login,logout;
    FrameLayout manuuFramlayout;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_manuu, container, false);

        back_manue = view.findViewById(R.id.back_manue);
        account = view.findViewById(R.id.account);
        order = view.findViewById(R.id.order);
        transaction = view.findViewById(R.id.transaction);
        watchlist = view.findViewById(R.id.watch_list);
        offer = view.findViewById(R.id.offer);
        Reward = view.findViewById(R.id.reward);
        settings = view.findViewById(R.id.settings);
        help = view.findViewById(R.id.help);
        login = view.findViewById(R.id.login);
        logout = view.findViewById(R.id.logout);
        manuuFramlayout = view.findViewById(R.id.manuuFramlayout);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Account();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();




            }
        });

        offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Order();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();


            }
        });

        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Transaction();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();

            }
        });

        watchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new WatchList();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();


            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new WatchList();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();


            }
        });

        Reward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Reward();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();


            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Settings();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();

            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Help();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Login();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();

            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new LogOut();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.manuuFramlayout,fragment,null).addToBackStack(null).commit();

            }
        });

        back_manue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(getActivity(),Home.class));
            }
        });

        return view;
    }
}