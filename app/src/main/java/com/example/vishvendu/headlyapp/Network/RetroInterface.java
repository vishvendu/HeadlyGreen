package com.example.vishvendu.headlyapp.Network;

import com.example.vishvendu.headlyapp.Model.Category;
import com.example.vishvendu.headlyapp.Model.Headly;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by vishvendu on 27/11/17.
 */

public interface RetroInterface {

    @GET
    Call<Headly> getCategory(@Url String url);

}
