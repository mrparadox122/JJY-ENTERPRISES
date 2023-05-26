package com.jjyenterprises.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel {
    String image,product_name,product_amount,product_detials;

    public HomeViewModel(String image, String product_name, String product_amount, String product_detials) {
        this.image = image;
        this.product_name = product_name;
        this.product_amount = product_amount;
        this.product_detials = product_detials;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(String product_amount) {
        this.product_amount = product_amount;
    }

    public String getProduct_detials() {
        return product_detials;
    }

    public void setProduct_detials(String product_detials) {
        this.product_detials = product_detials;
    }
}