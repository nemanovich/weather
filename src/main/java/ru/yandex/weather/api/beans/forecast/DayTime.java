package ru.yandex.weather.api.beans.forecast;

import com.google.gson.annotations.SerializedName;

public class DayTime {

    @SerializedName("temp_max")
    private Integer tempMax;
    private String condition;

    public Integer getTempMax() {
        return tempMax;
    }

    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
