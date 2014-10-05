package services;
import generated.ru.yandex.weather.forecast.ForecastType;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class YandexWeatherService {
	
	public static ForecastType getForecast(int id)
			throws JAXBException, MalformedURLException {
		JAXBContext context = JAXBContext.newInstance("generated.ru.yandex.weather.forecast");
	       Unmarshaller u = context.createUnmarshaller();
	       URL url = new URL(String.format("http://export.yandex.ru/weather-ng/forecasts/%s.xml", id));
	       JAXBElement<ForecastType> forecast = (JAXBElement<ForecastType>)u.unmarshal(url);
	       return forecast.getValue();
	}
}
