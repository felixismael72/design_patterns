package structural.adapter;

public class FahrenheitToCelsiusAdapter implements WeatherService {
  private ExternalFahrenheitWeatherService fahrenheitWeatherService;

  public FahrenheitToCelsiusAdapter(ExternalFahrenheitWeatherService fahrenheitWeatherService) {
    this.fahrenheitWeatherService = fahrenheitWeatherService;
  }

  @Override
  public double getTemperatureInCelsius(String city) {
    double temperatureInFahrenheit = fahrenheitWeatherService.getTemperature(city);
    System.out.println(temperatureInFahrenheit + "°F");
    return (temperatureInFahrenheit - 32) * (5.0 / 9.0);
  }
}
