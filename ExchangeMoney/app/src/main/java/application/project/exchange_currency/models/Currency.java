package application.project.exchange_currency.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("privacy")
    @Expose
    private String privacy;
    @SerializedName("currencies")
    @Expose
    private Currencies currencies;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Currencies getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

}
