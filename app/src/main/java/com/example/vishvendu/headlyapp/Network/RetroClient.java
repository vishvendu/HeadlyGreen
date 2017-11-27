package com.example.vishvendu.headlyapp.Network;




import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by vishvendu on 27/11/17.
 */

public class RetroClient {

    public static final String Base_URL = "https://stark-spire-93433.herokuapp.com/json/";

    private static Retrofit retrofit = null;


    public static Retrofit getClient(String base_URL) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
