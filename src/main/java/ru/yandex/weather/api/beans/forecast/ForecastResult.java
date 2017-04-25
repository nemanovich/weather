package ru.yandex.weather.api.beans.forecast;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class ForecastResult {
    private Fact fact;
    private List<Forecast> forecasts;

    @SerializedName("l10n")
    private Map<String, String> localization;

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    public Map<String, String> getLocalization() {
        return localization;
    }

    public void setLocalization(Map<String, String> localization) {
        this.localization = localization;
    }
}
