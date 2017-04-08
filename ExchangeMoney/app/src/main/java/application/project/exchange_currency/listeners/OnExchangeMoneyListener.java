package application.project.exchange_currency.listeners;

import application.project.exchange_currency.models.Currency;
import application.project.exchange_currency.models.ExchangeMoney;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OnExchangeMoneyListener {
//    @GET("movie/top_rated")
//    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("latest.json")
    Call<ExchangeMoney> exchange(@Query("app_id") String apiKey);

    //    http://apilayer.net/api/list?access_key=c3c1465cc1e66ac363da477d97f08a59
    @GET("list")
    Call<Currency> nationCurrency(@Query("access_key") String apiKey);
}
