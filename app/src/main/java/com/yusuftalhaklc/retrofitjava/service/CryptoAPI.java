package com.yusuftalhaklc.retrofitjava.service;

import com.yusuftalhaklc.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();



    //Call<List<CryptoModel>> getData();
}
