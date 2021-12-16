package com.yusuftalhaklc.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    @SerializedName("currency")
    public String currency;
    public String price;
}
