package com.example.manish.oldbook.fragmentclass;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.manish.oldbook.Adapter.NewBookAdapter;
import com.example.manish.oldbook.Adapter.OldBookAdapter;
import com.example.manish.oldbook.Model.ModelClassNewBook;
import com.example.manish.oldbook.Model.ModelClassOldBook;
import com.example.manish.oldbook.Model.NewBookInterface;
import com.example.manish.oldbook.R;

import java.util.ArrayList;
import java.util.List;

public class newbookk extends Fragment implements NewBookInterface {

    SearchView searchViewNewBook;

    NewBookAdapter newBookAdapter;

    List<ModelClassNewBook>modelClassNewBooks = new ArrayList<>();
    List<ModelClassNewBook>arrListNebook;


    RecyclerView recyleview_Newbookk;
    FrameLayout newBookk_framelayout;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_newbookk, container, false);

        recyleview_Newbookk = view.findViewById(R.id.recyleview_Newbookk);
        newBookk_framelayout = view.findViewById(R.id.newBookk_framelayout);
        searchViewNewBook = view.findViewById(R.id.searchViewNewBook);


        recyleview_Newbookk.setLayoutManager(new LinearLayoutManager(getContext()));

        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.flutter,"flutter","Jimmy porto","24/12/2004","4th","₹1200/-","₹1600","Free delivery Friday 2 jun."));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.javaa,"java","Dr.R.Nageswara Rao","2/12/2008","8th","₹400/-","₹600","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.je,"JEE MAIN Chemistry","Dr.Bhanu magan","2/12/2007","4th","₹300/-","₹490","Free delivery Friday 6 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.operation,"OPERATING SYSTEM","Rajiv chopra","8/04/2010","2th","₹512/-","₹700"," delivery charge 40 Rupes Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.bb,"BUSINESS AND MANAGEMENT","Michael a.witt","2/12/1999","1th","₹999/-","₹1200","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.t,"THINK WE NEVER GOT OVER","Lucy Score","04/01/2006","1th","₹299/-","₹400","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.o,"ORGANIC CHEMISTRY","JIN AND JON","2/12/2007","7th","₹500/-","₹600","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.cpp,"C++","E Balagurusamy","2/12/2008","8th","₹700/-","₹1000","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.f,"flutter","Olivia evans","2/12/2008","8th","₹369/-","₹600","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.jee,"JEE MAIN PHYSICS","DB Singh","2/12/2008","8th","₹450/-","₹600","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.mm,"Discret Mathematics and Graph Theoty","C.gaill","2/12/2008","8th","₹800/-","₹900","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.ccp,"C++","Bjarne &  jon","2/12/2008","8th","₹300/-","₹700","Free delivery Friday 15 jun"));
        modelClassNewBooks.add(new ModelClassNewBook(R.drawable.hh,"Higher Engineering Mathematics","p.k.l.","2/12/2008","8th","₹800/-","₹1200","Free delivery Friday 15 jun"));


        newBookAdapter = new NewBookAdapter(getContext(),modelClassNewBooks,newbookk.this);
        recyleview_Newbookk.setAdapter(newBookAdapter);


        searchViewNewBook.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                arrListNebook = new ArrayList<>();
                if(query.length()>0)
                {
                    for(int i = 0; i< modelClassNewBooks.size(); i++)
                    {
                        if(modelClassNewBooks.get(i).getNewbook_name().toUpperCase().contains(query.toUpperCase()))
                        {
                            ModelClassNewBook modal = new ModelClassNewBook();
                            modal.setNewbook_name(modelClassNewBooks.get(i).getNewbook_name());
                            modal.setNew_author_name(modelClassNewBooks.get(i).getNew_author_name());

                            modal.setNewbook_date(modelClassNewBooks.get(i).getNewbook_date());
                            modal.setNewbook_delivery(modelClassNewBooks.get(i).getNewbook_delivery());
                            modal.setNewbook_img(modelClassNewBooks.get(i).getNewbook_img());
                            modal.setNewbook_price(modelClassNewBooks.get(i).getNewbook_price());
                            modal.setNewbook_new_price(modelClassNewBooks.get(i).getNewbook_new_price());
                            modal.setNewbook_edition(modelClassNewBooks.get(i).getNewbook_edition());

                            arrListNebook.add(modal);
                        }

                    }

                    recyleview_Newbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    newBookAdapter = new NewBookAdapter(getContext(),arrListNebook,newbookk.this);
                    recyleview_Newbookk.setAdapter(newBookAdapter);



                }
                else
                {
                    recyleview_Newbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    newBookAdapter = new NewBookAdapter(getContext(),modelClassNewBooks,newbookk.this);
                    recyleview_Newbookk.setAdapter(newBookAdapter);

                }




                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {


                arrListNebook = new ArrayList<>();
                if(newText.length()>0)
                {
                    for(int i = 0; i< modelClassNewBooks.size(); i++)
                    {
                        if(modelClassNewBooks.get(i).getNewbook_name().toUpperCase().contains(newText.toUpperCase()))
                        {
                            ModelClassNewBook modal = new ModelClassNewBook();
                            modal.setNewbook_name(modelClassNewBooks.get(i).getNewbook_name());
                            modal.setNew_author_name(modelClassNewBooks.get(i).getNew_author_name());

                            modal.setNewbook_date(modelClassNewBooks.get(i).getNewbook_date());
                            modal.setNewbook_delivery(modelClassNewBooks.get(i).getNewbook_delivery());
                            modal.setNewbook_img(modelClassNewBooks.get(i).getNewbook_img());
                            modal.setNewbook_price(modelClassNewBooks.get(i).getNewbook_price());
                            modal.setNewbook_new_price(modelClassNewBooks.get(i).getNewbook_new_price());
                            modal.setNewbook_edition(modelClassNewBooks.get(i).getNewbook_edition());

                            arrListNebook.add(modal);
                        }

                    }

                    recyleview_Newbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    newBookAdapter = new NewBookAdapter(getContext(),arrListNebook,newbookk.this);
                    recyleview_Newbookk.setAdapter(newBookAdapter);



                }
                else
                {
                    recyleview_Newbookk.setLayoutManager(new LinearLayoutManager(getContext()));

                    newBookAdapter = new NewBookAdapter(getContext(),modelClassNewBooks,newbookk.this);
                    recyleview_Newbookk.setAdapter(newBookAdapter);

                }





                return false;
            }
        });

        return view;




    }



    @Override
    public void itmeOnClickNew(int position) {



        Bundle bundle = new Bundle();

        bundle.putString("key_bookname",modelClassNewBooks.get(position).getNewbook_name());// Put anything what you want
        bundle.putString("key_authorname",modelClassNewBooks.get(position).getNew_author_name());// Put anything what you want
        bundle.putString("key_editation", modelClassNewBooks.get(position).getNewbook_edition());// Put anything what you want
        bundle.putString("key_oldprice",modelClassNewBooks.get(position).getNewbook_price());// Put anything what you want
        bundle.putString("key_newprice",modelClassNewBooks.get(position).getNewbook_new_price());// Put anything what you want
        bundle.putString("key_delivery",modelClassNewBooks.get(position).getNewbook_delivery());// Put anything what you want
        bundle.putInt("key_oldimg",modelClassNewBooks.get(position).getNewbook_img());// Put anything what you want

        Fragment fragment = new NewBookkUnder();
        fragment.setArguments(bundle);


        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.newBookk_framelayout,fragment).commit();

    }


}