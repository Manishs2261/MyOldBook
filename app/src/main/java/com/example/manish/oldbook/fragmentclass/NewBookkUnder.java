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


public class NewBookkUnder extends Fragment {


    TextView new_u_booName,new_u_authorName,new_u_editation,new_u_oldprice,new_u_marpprice,new_u_delivery;
    ImageView new_u_boook,new_book_img;

    FrameLayout newBookUnderFramlayout;

    Button new_u_cartbutton,new_u_buybutton;





    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_bookk_under, container, false);

        new_u_boook = view.findViewById(R.id.new_u_back);
        new_book_img = view.findViewById(R.id.new_book_img);
        new_u_booName = view.findViewById(R.id.new_u_booName);
        new_u_authorName = view.findViewById(R.id.new_u_authorName);
        new_u_editation = view.findViewById(R.id.new_u_editation);
        new_u_oldprice = view.findViewById(R.id.new_u_oldprice);
        new_u_marpprice = view.findViewById(R.id.new_u_marpprice);
        new_u_delivery = view.findViewById(R.id.new_u_delivery);
        new_u_buybutton = view.findViewById(R.id.old_u_buybutton);
        new_u_cartbutton = view.findViewById(R.id.old_u_cartbutton);
        newBookUnderFramlayout = view.findViewById(R.id.newBookUnderFramlayout);




        Bundle bundle = this.getArguments();

        if(bundle != null) {
            // handle your code here.

            String name = bundle.getString("key_bookname");
            String author = bundle.getString("key_authorname");
            String editation = bundle.getString("key_editation");
            String oldprice = bundle.getString("key_oldprice");
            String newprice = bundle.getString("key_newprice");
            String delivery = bundle.getString("key_delivery");
            int oldimg = bundle.getInt("key_oldimg");

            new_u_booName.setText(name);
            new_u_authorName.setText(author);
            new_u_editation.setText(editation);
            new_u_oldprice.setText(oldprice);
            new_u_marpprice.setText(newprice);
            new_u_delivery.setText(delivery);
            new_book_img.setImageResource(oldimg);
        }

        new_u_boook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment fragment = new newbookk();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.newBookUnderFramlayout,fragment,null).addToBackStack(null).commit();

            }
        });


        new_u_cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Add cart", Toast.LENGTH_SHORT).show();
            }
        });

        new_u_buybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "buy", Toast.LENGTH_SHORT).show();
            }
        });
        return  view;
    }
}