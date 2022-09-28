package com.berkecemoktem.currencyappretrofit.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    @SerializedName("currency")//annotation that stands for json data.
    public String currency;
    @SerializedName("price")
    public String price;

}
