package application.project.exchange_currency.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitIml {
    public static Retrofit retrofit = null;
    public static Retrofit getRetrofit(String url){
        retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
