package com.example.manish.oldbook.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manish.oldbook.Model.ModelClassNewBook;
import com.example.manish.oldbook.Model.NewBookInterface;
import com.example.manish.oldbook.Model.OldBook_Modal_interface;
import com.example.manish.oldbook.R;

import java.util.List;

public class NewBookAdapter extends RecyclerView.Adapter<NewBookAdapter.ViewHOlder> {

    private final NewBookInterface newBookInterface;
   private List<ModelClassNewBook>modelClassNewBooks;

    int lastposition = -1;
    Context context;

    public NewBookAdapter(Context context,List<ModelClassNewBook>modelClassNewBooks,NewBookInterface newBookInterface) {
        this.context = context;
        this.modelClassNewBooks = modelClassNewBooks;
        this.newBookInterface = newBookInterface;


    }

    @NonNull
    @Override
    public NewBookAdapter.ViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context= parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.newbook_layout,parent,false);
        return new ViewHOlder(view,newBookInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull NewBookAdapter.ViewHOlder holder, int position) {

        holder.newbook_img.setImageResource(modelClassNewBooks.get(position).getNewbook_img());
        holder.newbook_name.setText(modelClassNewBooks.get(position).getNewbook_name());
        holder.new_author_name.setText( modelClassNewBooks.get(position).getNew_author_name());
        holder.newbook_date.setText(modelClassNewBooks.get(position).getNewbook_date());
        holder.newbook_edition.setText( modelClassNewBooks.get(position).getNewbook_edition());
        holder.newbook_price.setText(modelClassNewBooks.get(position).getNewbook_price());
        holder.newbook_new_price.setText(modelClassNewBooks.get(position).getNewbook_new_price());
        holder.newbook_delivery.setText(modelClassNewBooks.get(position).getNewbook_delivery());

        rv_handleNewBOOk(position);  // create mathod to handle recyleview


    }

    @Override
    public int getItemCount() {
        return modelClassNewBooks.size();
    }

    public class ViewHOlder extends RecyclerView.ViewHolder {

        ImageView newbook_img;
        TextView   newbook_name ,new_author_name , newbook_date ,newbook_edition , newbook_price , newbook_new_price,
                newbook_delivery ;
        public ViewHOlder(@NonNull View itemView,NewBookInterface newBookInterface) {
            super(itemView);

            newbook_img = itemView.findViewById(R.id.newBook_image);
            newbook_name = itemView.findViewById(R.id.new_book_name);
            new_author_name = itemView.findViewById(R.id.new_author_name);
            newbook_date = itemView.findViewById(R.id.new_print_date);
            newbook_edition = itemView.findViewById(R.id.newbook_edition);
            newbook_price = itemView.findViewById(R.id.new_book_price);
            newbook_new_price = itemView.findViewById(R.id.newbook_new_price);

            newbook_delivery = itemView.findViewById(R.id.new_deliver);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (newBookInterface != null) {

                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION)
                            newBookInterface.itmeOnClickNew(pos);
                    }

                }
            });


        }
    }

    public void rv_handleNewBOOk(int position)
    {

        if(position > lastposition)
        {
            lastposition = position;
        }

    }
}
