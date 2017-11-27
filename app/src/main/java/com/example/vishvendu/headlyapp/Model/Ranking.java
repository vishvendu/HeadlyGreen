package com.example.vishvendu.headlyapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vishvendu on 27/11/17.
 */

public class Ranking {

    @SerializedName("ranking")
    @Expose
    private String ranking;
    @SerializedName("products")
    @Expose
    private List<Product_> products = null;

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public List<Product_> getProducts() {
        return products;
    }

    public void setProducts(List<Product_> products) {
        this.products = products;
    }

}