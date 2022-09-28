package com.berkecemoktem.currencyappretrofit.service;

import com.berkecemoktem.currencyappretrofit.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
    //URL BASE -> https://raw.githubusercontent.com

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")//the address that we'll send get request...
    Observable<List<CryptoModel>>getData();
    //Call<List<CryptoModel>> getData(); //and collect the data as a list of CryptoModel.
}
