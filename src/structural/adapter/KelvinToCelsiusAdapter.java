package structural.adapter;

public class KelvinToCelsiusAdapter implements WeatherService {
  private ExternalKelvinWeatherService kelvinWeatherService;

  public KelvinToCelsiusAdapter(ExternalKelvinWeatherService kelvinWeatherService) {
    this.kelvinWeatherService = kelvinWeatherService;
  }

  @Override
  public double getTemperatureInCelsius(String city) {
    double temperatureInKelvin = kelvinWeatherService.getTemperature(city);
    System.out.println(temperatureInKelvin + "°K");
    return temperatureInKelvin - 273.15;
  }
}
