package com.example.vishvendu.headlyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vishvendu.headlyapp.Model.Category;
import com.example.vishvendu.headlyapp.Model.Headly;
import com.example.vishvendu.headlyapp.Network.ApiUtils;
import com.example.vishvendu.headlyapp.Network.RetroInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.vishvendu.headlyapp.Network.RetroClient.Base_URL;

public class MainActivity extends AppCompatActivity {


    private RetroInterface retroInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retroInterface = ApiUtils.getSOService();

        retroInterface.getCategory(Base_URL).enqueue(new Callback<Headly>() {
            @Override
            public void onResponse(Call<Headly> call, Response<Headly> response) {

                if(response.isSuccessful()) {


                    for(int i = 0 ; i < response.body().getCategories().size() ; i ++){

                        System.out.println("response "+ response.body().getCategories().get(i).getName());

                       // System.out.println("response "+ response.body().getCategories().get(i).getProducts().get(i).getName());

                    }


                }else {
                    int statusCode  = response.code();
                    // handle request errors depending on status code
                }


            }

            @Override
            public void onFailure(Call<Headly> call, Throwable t) {

            }




        });


    }
}
