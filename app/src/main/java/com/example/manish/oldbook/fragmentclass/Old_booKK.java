package com.example.manish.oldbook.fragmentclass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manish.oldbook.Adapter.OldBookAdapter;
import com.example.manish.oldbook.Mic;
import com.example.manish.oldbook.Model.ModelClassOldBook;
import com.example.manish.oldbook.Model.OldBook_Modal_interface;
import com.example.manish.oldbook.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class Old_booKK extends Fragment implements OldBook_Modal_interface{

    OldBookAdapter oldBookAdapter;


    List<ModelClassOldBook>modelClassOldBooks = new ArrayList<>();
    List<ModelClassOldBook>arrList;

    RecyclerView recyleview_oldbookk;
    FrameLayout oldBookk_framelayout;
    SearchView serchviewOldbook;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_old_boo_k_k, container, false);


        recyleview_oldbookk = view.findViewById(R.id.recyleview_oldbookk);
        oldBookk_framelayout  = view.findViewById(R.id.oldBookk_framelayout);
        serchviewOldbook = view.findViewById(R.id.serchviewOldbook);





        recyleview_oldbookk.setLayoutManager(new LinearLayoutManager(getContext()));

        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.datas,"DATA STRUCTURES","Sartaj sahni","22/06/2022","2th","₹150","₹700","Bilaspur","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.bbb,"MCA SOLVED PAPERS","AMIT AGRAVAL","22/04/2023","1th","₹160","₹400","Raipur","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.cc,"11TH MATHEMATICS","RD SHRAME","22/0=12/2023","1th","₹200","₹600","Bilaspur","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.dd,"NDA SOLVED PAERS","A.K MURTI","22/04/2023","3th","₹50","₹150","Bhilai","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.aa,"Think AND GOROW RICH","Nepoliya mil","22/04/2023","1th","₹100","₹400","Durg","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.ff,"COMPLETE MATHEMATICS","LUCENT'S","22/04/2023","1th","₹120","₹380","Bilaspur","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.jj,"CG HISTRY","IAS ACADEMY","22/04/2023","1th","₹40","₹200","Bilaspur","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.kk,"CHHATTISGARH GENERAL KNOWLODGE","IAS ACADEMY","22/04/2023","1th","₹200","₹400","Raipur","Free Deliver on monday "));
        modelClassOldBooks.add(new ModelClassOldBook(R.drawable.ll,"JEE ADVANCE CHEMISTRY","MKL VERAM","22/04/2023","2th","₹300","₹800","Bilaspur","Free Deliver on monday "));



        oldBookAdapter = new OldBookAdapter(getContext(),modelClassOldBooks,Old_booKK.this);
        recyleview_oldbookk.setAdapter(oldBookAdapter);






        //========search view code =============================================

        serchviewOldbook.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {


                arrList = new ArrayList<>();
                if(query.length()>0)
                {
                    for(int i = 0; i< modelClassOldBooks.size(); i++)
                    {
                        if(modelClassOldBooks.get(i).getOldbook_name().toUpperCase().contains(query.toUpperCase()))
                        {
                            ModelClassOldBook modal = new ModelClassOldBook();
                            modal.setOldbook_name(modelClassOldBooks.get(i).getOldbook_name());
                            modal.setOld_author_name(modelClassOldBooks.get(i).getOld_author_name());
                            modal.setOldbook_city(modelClassOldBooks.get(i).getOldbook_city());
                            modal.setOldbook_date(modelClassOldBooks.get(i).getOldbook_date());
                            modal.setOldbook_delivery(modelClassOldBooks.get(i).getOldbook_delivery());
                            modal.setOldbook_img(modelClassOldBooks.get(i).getOldbook_img());
                            modal.setOldbook_price(modelClassOldBooks.get(i).getOldbook_price());
                            modal.setOldbook_new_price(modelClassOldBooks.get(i).getOldbook_new_price());
                            modal.setOldbook_edition(modelClassOldBooks.get(i).getOldbook_edition());

                            arrList.add(modal);
                        }

                    }

                    recyleview_oldbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    oldBookAdapter = new OldBookAdapter(getContext(),arrList,Old_booKK.this);
                    recyleview_oldbookk.setAdapter(oldBookAdapter);



                }
                else
                {
                    recyleview_oldbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    oldBookAdapter = new OldBookAdapter(getContext(),modelClassOldBooks,Old_booKK.this);
                    recyleview_oldbookk.setAdapter(oldBookAdapter);

                }



                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {


                arrList = new ArrayList<>();
                if(newText.length()>0)
                {
                    for(int i = 0; i< modelClassOldBooks.size(); i++) {
                        if (modelClassOldBooks.get(i).getOldbook_name().toUpperCase().contains(newText.toUpperCase())) {
                            ModelClassOldBook modal = new ModelClassOldBook();
                            modal.setOldbook_name(modelClassOldBooks.get(i).getOldbook_name());
                            modal.setOld_author_name(modelClassOldBooks.get(i).getOld_author_name());
                            modal.setOldbook_city(modelClassOldBooks.get(i).getOldbook_city());
                            modal.setOldbook_date(modelClassOldBooks.get(i).getOldbook_date());
                            modal.setOldbook_delivery(modelClassOldBooks.get(i).getOldbook_delivery());
                            modal.setOldbook_img(modelClassOldBooks.get(i).getOldbook_img());
                            modal.setOldbook_price(modelClassOldBooks.get(i).getOldbook_price());
                            modal.setOldbook_new_price(modelClassOldBooks.get(i).getOldbook_new_price());
                            modal.setOldbook_edition(modelClassOldBooks.get(i).getOldbook_edition());

                            arrList.add(modal);
                        }
                    }
                        recyleview_oldbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                        oldBookAdapter = new OldBookAdapter(getContext(),arrList,Old_booKK.this);
                        recyleview_oldbookk.setAdapter(oldBookAdapter);




                }
                else
                {
                    recyleview_oldbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    oldBookAdapter = new OldBookAdapter(getContext(),modelClassOldBooks,Old_booKK.this);
                    recyleview_oldbookk.setAdapter(oldBookAdapter);
                }
                return false;

            }
        });


        //========search view method =============================================

        return view;
    }





    @Override
    public void itmeOnClick(int position) {


        Bundle bundle = new Bundle();
        bundle.putString("key_bookname",modelClassOldBooks.get(position).getOldbook_name());// Put anything what you want
        bundle.putString("key_authorname",modelClassOldBooks.get(position).getOld_author_name());// Put anything what you want
        bundle.putString("key_editation",modelClassOldBooks.get(position).getOldbook_edition());// Put anything what you want
        bundle.putString("key_oldprice",modelClassOldBooks.get(position).getOldbook_price());// Put anything what you want
        bundle.putString("key_newprice",modelClassOldBooks.get(position).getOldbook_new_price());// Put anything what you want
        bundle.putString("key_delivery",modelClassOldBooks.get(position).getOldbook_delivery());// Put anything what you want
        bundle.putInt("key_oldimg",modelClassOldBooks.get(position).getOldbook_img());// Put anything what you want



        Fragment fragment = new OldBookkUnder();
        fragment.setArguments(bundle);


        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.oldBookk_framelayout,fragment,null).addToBackStack(null).commit();

    }
}