package com.example.manish.oldbook.fragmentclass;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manish.oldbook.R;


public class OldBookkUnder extends Fragment {

    TextView old_u_booName,old_u_authorName,old_u_editation,old_u_oldprice,old_u_marpprice,old_u_delivery;

    Button old_u_cartbutton,old_u_buybutton;

FrameLayout oldbookUnderFarmlayout;


ImageView old_u_back,old_book_img;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_old_bookk_under, container, false);


        old_u_back = view.findViewById(R.id.old_u_back);
        oldbookUnderFarmlayout = view.findViewById(R.id.oldbookUnderFarmlayout);
        old_u_booName = view.findViewById(R.id.new_u_booName);
        old_u_authorName = view.findViewById(R.id.new_u_authorName);
        old_u_editation = view.findViewById(R.id.new_u_editation);
        old_u_oldprice = view.findViewById(R.id.new_u_oldprice);
        old_u_marpprice = view.findViewById(R.id.new_u_marpprice);
        old_u_delivery = view.findViewById(R.id.new_u_delivery);
        old_book_img = view.findViewById(R.id.new_book_img);
        old_u_buybutton = view.findViewById(R.id.old_u_buybutton);
        old_u_cartbutton = view.findViewById(R.id.old_u_cartbutton);


        Bundle bundle = this.getArguments();

        if(bundle != null){
            // handle your code here.

           String name = bundle.getString("key_bookname");
           String author = bundle.getString("key_authorname");
           String editation = bundle.getString("key_editation");
           String oldprice = bundle.getString("key_oldprice");
           String newprice = bundle.getString("key_newprice");
           String delivery = bundle.getString("key_delivery");
           int oldimg = bundle.getInt("key_oldimg");

             old_u_booName.setText(name);
            old_u_authorName.setText(author);
            old_u_editation.setText(editation);
            old_u_oldprice.setText(oldprice);
            old_u_marpprice.setText(newprice);
            old_u_delivery.setText(delivery);
            old_book_img.setImageResource(oldimg);







        }



        old_u_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Old_booKK();

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.oldbookUnderFarmlayout,fragment,null).addToBackStack(null).commit();

            }
        });



        old_u_cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "add cart", Toast.LENGTH_SHORT).show();
            }
        });
        
        old_u_buybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "buy", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}