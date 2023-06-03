package com.example.manish.oldbook.Model;

public class ModelClassOldBook {

    public    int   oldbook_img ;
    public   String   oldbook_name ;
    public String  old_author_name ;
    public  String  oldbook_date ;
    public String  oldbook_edition ;
    public  String  oldbook_price ;
    public   String  oldbook_new_price ;
    public  String  oldbook_city ;
    public  String  oldbook_delivery ;



public ModelClassOldBook()
{

}


    public ModelClassOldBook(int oldbook_img, String oldbook_name, String old_author_name, String oldbook_date,
                             String oldbook_edition, String oldbook_price, String oldbook_new_price, String oldbook_city,
                             String oldbook_delivery)
    {

        this.oldbook_img = oldbook_img;
        this.oldbook_name = oldbook_name;
        this.old_author_name = old_author_name;
        this.oldbook_date = oldbook_date;
        this.oldbook_edition = oldbook_edition;
        this.oldbook_price = oldbook_price;
        this.oldbook_new_price = oldbook_new_price;
        this.oldbook_city = oldbook_city;
        this.oldbook_delivery = oldbook_delivery;
    }

    public int getOldbook_img() {
        return oldbook_img;
    }

    public void setOldbook_img(int oldbook_img) {
        this.oldbook_img = oldbook_img;
    }

    public String getOldbook_name() {
        return oldbook_name;
    }

    public void setOldbook_name(String oldbook_name) {
        this.oldbook_name = oldbook_name;
    }

    public String getOld_author_name() {
        return old_author_name;
    }

    public void setOld_author_name(String old_author_name) {
        this.old_author_name = old_author_name;
    }

    public String getOldbook_date() {
        return oldbook_date;
    }

    public void setOldbook_date(String oldbook_date) {
        this.oldbook_date = oldbook_date;
    }

    public String getOldbook_edition() {
        return oldbook_edition;
    }

    public void setOldbook_edition(String oldbook_edition) {
        this.oldbook_edition = oldbook_edition;
    }

    public String getOldbook_price() {
        return oldbook_price;
    }

    public void setOldbook_price(String oldbook_price) {
        this.oldbook_price = oldbook_price;
    }

    public String getOldbook_new_price() {
        return oldbook_new_price;
    }

    public void setOldbook_new_price(String oldbook_new_price) {
        this.oldbook_new_price = oldbook_new_price;
    }

    public String getOldbook_city() {
        return oldbook_city;
    }

    public void setOldbook_city(String oldbook_city) {
        this.oldbook_city = oldbook_city;
    }

    public String getOldbook_delivery() {
        return oldbook_delivery;
    }

    public void setOldbook_delivery(String oldbook_delivery) {
        this.oldbook_delivery = oldbook_delivery;
    }
}

