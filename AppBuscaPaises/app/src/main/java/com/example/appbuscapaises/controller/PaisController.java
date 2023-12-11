package com.example.appbuscapaises.controller;


import androidx.recyclerview.widget.RecyclerView;

import com.example.appbuscapaises.dto.PaisDTO;
import com.example.appbuscapaises.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PaisController {

    public static void getViaEndereco(String codigo, RecyclerView Rcview){

        try{
            Call<PaisDTO> call = new RetrofitConfig().
                    paisService().
                    getViaEndereco(codigo, Rcview.getTransitionName());

            call.enqueue(new Callback<PaisDTO>() {
                @Override
                public void onResponse(Call<PaisDTO> call, Response<PaisDTO> response) {
                    PaisDTO dto = response.body();

                }

                @Override
                public void onFailure(Call call, Throwable t) {

                }
            });
        }catch(Exception ex){}

    }


}
