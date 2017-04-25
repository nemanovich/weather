package ru.yandex.weather.utils.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import java.text.DecimalFormat;

public class TemperatureMatcher extends TypeSafeDiagnosingMatcher<String> {
    private Integer temp;
    private String postfix = "";

    private TemperatureMatcher(Integer temp) {
        this.temp = temp;
    }

    @Override
    public void describeTo(Description description) {
        description.appendValue(formatTemp(temp)).appendValue(postfix);
        if (!this.postfix.isEmpty()) {
            description.appendValue(postfix);
        }
    }

    @Override
    protected boolean matchesSafely(String actualString, Description description) {
        description.appendValue(actualString);
        return (formatTemp(temp) + postfix).equals(actualString);
    }

    @Factory
    public static TemperatureMatcher isTemperature(Integer temp) {
        return new TemperatureMatcher(temp);
    }

    public TemperatureMatcher withDegree() {
        this.postfix += " °C";
        return this;
    }

    private static String formatTemp(Integer t) {
        return t == 0 ? "0" : new DecimalFormat("+#;-#").format(t);
    }
}
