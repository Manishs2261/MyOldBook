package com.example.manish.oldbook;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.manish.oldbook.fragmentclass.Chatt;
import com.example.manish.oldbook.fragmentclass.Manuu;
import com.example.manish.oldbook.fragmentclass.Old_booKK;
import com.example.manish.oldbook.fragmentclass.newbookk;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    ConstraintLayout homefragment1;
    FrameLayout framelayouthome;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.buttom_navigation);

        homefragment1 = (ConstraintLayout)findViewById(R.id.homefragment1);
        framelayouthome = (FrameLayout) findViewById(R.id.framelayouthome);




        //=================for Bottom Navigation Bar Code ===========================

        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId())
            {
                case R.id.hhome:
                    startActivity(new Intent(getApplicationContext(), Home.class));

                    return true;
                case R.id.old_book:
                    //startActivity(new Intent(getApplicationContext(),OldBook.class));
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayouthome,new Old_booKK(),null).addToBackStack(null).commit();

                    return true;

                case R.id.new_book:
                   // startActivity(new Intent(getApplicationContext(),NewBook.class));
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayouthome,new newbookk(),null).addToBackStack(null).commit();
                    return true;

                case R.id.chat:
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayouthome,new Chatt(),null).addToBackStack(null).commit();
                    return true;

                case R.id.menu:
                   // startActivity(new Intent(getApplicationContext(),Menu.class));
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayouthome,new Manuu(),null).addToBackStack(null).commit();
                    return true;
            }

                   return false;

        });

        //=================for Bottom Navigation Bar Code ===========================

//=======================Intent pass for mic ================================




        //=============================search view code ==============================//







    }
    //=====================on bcak press open dilog box ==========================
//    public void onBackPressed() {
//
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
//        alertDialog.setTitle("Close..");
//        alertDialog.setMessage("Do you want to close this application ..?");
//        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//                finishAffinity();
//
//            }
//        });
//        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
//
//        alertDialog.show();
//
//    }

    //=====================on bcak press open dilog box ==========================

}