package application.project.exchange_currency.listeners;

import application.project.exchange_currency.models.Rates;


public interface CallbackRates {
    void onSuccess(Rates rates);
    void onFailure();
}
