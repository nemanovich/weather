package ru.yandex.weather.api.beans.forecast;

public class Parts {
    private DayTime morning;
    private DayTime day;

    public DayTime getMorning() {
        return morning;
    }

    public void setMorning(DayTime morning) {
        this.morning = morning;
    }

    public DayTime getDay() {
        return day;
    }

    public void setDay(DayTime day) {
        this.day = day;
    }

}
