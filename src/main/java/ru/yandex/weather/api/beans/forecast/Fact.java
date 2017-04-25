package ru.yandex.weather.api.beans.forecast;

public class Fact {
    private Integer temp;
    private String condition;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
