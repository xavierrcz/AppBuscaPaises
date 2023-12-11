package com.example.appbuscapaises.service;
import com.example.appbuscapaises.dto.PaisDTO;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface IPaisService {

        @GET("ws/{codigo/descricao}/json/")
        Call<PaisDTO> getViaEndereco(@Path("codigo/descricao")String codigo,String descricao);

        //  Call<ArrayList<PaisDTO>>

}
