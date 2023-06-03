package com.example.manish.oldbook.Model;

public class ModelClassNewBook {

    public    int   newbook_img ;
    public   String   newbook_name ;
    public String  new_author_name ;
    public  String  newbook_date ;
    public String  newbook_edition ;
    public  String  newbook_price ;
    public   String  newbook_new_price ;

    public  String  newbook_delivery ;

    public ModelClassNewBook()
    {

    }


    public ModelClassNewBook(int newbook_img, String newbook_name, String new_author_name, String newbook_date, String newbook_edition, String newbook_price, String newbook_new_price,  String newbook_delivery) {
        this.newbook_img = newbook_img;
        this.newbook_name = newbook_name;
        this.new_author_name = new_author_name;
        this.newbook_date = newbook_date;
        this.newbook_edition = newbook_edition;
        this.newbook_price = newbook_price;
        this.newbook_new_price = newbook_new_price;

        this.newbook_delivery = newbook_delivery;
    }

    public int getNewbook_img() {
        return newbook_img;
    }

    public void setNewbook_img(int newbook_img) {
        this.newbook_img = newbook_img;
    }

    public String getNewbook_name() {
        return newbook_name;
    }

    public void setNewbook_name(String newbook_name) {
        this.newbook_name = newbook_name;
    }

    public String getNew_author_name() {
        return new_author_name;
    }

    public void setNew_author_name(String new_author_name) {
        this.new_author_name = new_author_name;
    }

    public String getNewbook_date() {
        return newbook_date;
    }

    public void setNewbook_date(String newbook_date) {
        this.newbook_date = newbook_date;
    }

    public String getNewbook_edition() {
        return newbook_edition;
    }

    public void setNewbook_edition(String newbook_edition) {
        this.newbook_edition = newbook_edition;
    }

    public String getNewbook_price() {
        return newbook_price;
    }

    public void setNewbook_price(String newbook_price) {
        this.newbook_price = newbook_price;
    }

    public String getNewbook_new_price() {
        return newbook_new_price;
    }

    public void setNewbook_new_price(String newbook_new_price) {
        this.newbook_new_price = newbook_new_price;
    }



    public String getNewbook_delivery() {
        return newbook_delivery;
    }

    public void setNewbook_delivery(String newbook_delivery) {
        this.newbook_delivery = newbook_delivery;
    }
}
