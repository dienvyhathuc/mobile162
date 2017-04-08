package application.project.exchange_currency.listeners;

import java.util.List;

import application.project.exchange_currency.models.RateExchange;


public interface CallbackCurrencies {
    void onSuccess(List<RateExchange> rateExchangeList, double default_rate);
    void onFailure();
}
