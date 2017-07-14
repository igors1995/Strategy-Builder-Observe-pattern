package weatherStation;

import display.CurrentConditionDisplay;
import subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(11, 22, 55);
		weatherData.setMeasurements(12, 122, 155);
	}
}
