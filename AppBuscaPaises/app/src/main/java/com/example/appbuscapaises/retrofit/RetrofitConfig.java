package com.example.appbuscapaises.retrofit;

import com.example.appbuscapaises.service.IPaisService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
public class RetrofitConfig {


    private Retrofit retrofit;
    private static final String BASE_URL = "https://falabr.cgu.gov.br/api/paises";

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    public IPaisService paisService(){
        return this.retrofit.create(IPaisService.class);
    }
}
