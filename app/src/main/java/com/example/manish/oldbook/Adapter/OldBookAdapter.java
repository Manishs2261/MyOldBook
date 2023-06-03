package com.example.manish.oldbook.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manish.oldbook.Model.ModelClassOldBook;
import com.example.manish.oldbook.Model.OldBook_Modal_interface;
import com.example.manish.oldbook.R;

import java.util.List;

public class OldBookAdapter extends RecyclerView.Adapter<OldBookAdapter.ViewHOlder> {

    private final OldBook_Modal_interface oldBook_modal_interface;

    private List<ModelClassOldBook>modelClassOldBooks;

    int lastposition = -1;
    Context context;


    public OldBookAdapter(Context context,List<ModelClassOldBook>modelClassOldBooks,OldBook_Modal_interface oldBook_modal_interface) {

        this.context = context;
        this.modelClassOldBooks = modelClassOldBooks;
        this.oldBook_modal_interface = oldBook_modal_interface;

    }

    @NonNull
    @Override
    public OldBookAdapter.ViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context= parent.getContext();

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.old_recycleview_layout,parent,false);
        return new ViewHOlder(view,oldBook_modal_interface);
    }

    @Override
    public void onBindViewHolder(@NonNull OldBookAdapter.ViewHOlder holder, int position) {

     holder.oldbook_img.setImageResource(modelClassOldBooks.get(position).getOldbook_img());
     holder.oldbook_name.setText(modelClassOldBooks.get(position).getOldbook_name());
     holder.old_author_name.setText(modelClassOldBooks.get(position).getOld_author_name());
     holder.oldbook_date.setText(modelClassOldBooks.get(position).getOldbook_date());
     holder.oldbook_edition.setText(modelClassOldBooks.get(position).getOldbook_edition());
     holder.oldbook_price.setText(modelClassOldBooks.get(position).getOldbook_price());
     holder.oldbook_new_price.setText(modelClassOldBooks.get(position).getOldbook_new_price());
     holder.oldbook_city.setText(modelClassOldBooks.get(position).getOldbook_city());
     holder.oldbook_delivery.setText(modelClassOldBooks.get(position).getOldbook_delivery());


        rv_handle(position); // create mathod to handle recyleview




}

    @Override
    public int getItemCount() {
        return modelClassOldBooks.size();
    }

    public class ViewHOlder extends RecyclerView.ViewHolder {

        ImageView oldbook_img;
        TextView   oldbook_name ,old_author_name , oldbook_date ,oldbook_edition , oldbook_price , oldbook_new_price,
                oldbook_city ,oldbook_delivery,old_u_booName ;
        public ViewHOlder(@NonNull View itemView,OldBook_Modal_interface OldBook_Modal_interface) {
            super(itemView);

            oldbook_img = itemView.findViewById(R.id.newBook_image);
            oldbook_name = itemView.findViewById(R.id.new_book_name);
            old_author_name = itemView.findViewById(R.id.new_author_name);
            oldbook_date = itemView.findViewById(R.id.new_print_date);
            oldbook_edition = itemView.findViewById(R.id.newbook_edition);
            oldbook_price = itemView.findViewById(R.id.new_book_price);
            oldbook_new_price = itemView.findViewById(R.id.newbook_new_price);
            oldbook_city = itemView.findViewById(R.id.old_city);
            oldbook_delivery = itemView.findViewById(R.id.new_deliver);




            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (OldBook_Modal_interface != null) {

                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION)
                            OldBook_Modal_interface.itmeOnClick(pos);



                    }

                }
            });


        }
    }


        public void rv_handle(int position)
        {

            if(position > lastposition)
            {
                lastposition = position;
            }

        }
}
