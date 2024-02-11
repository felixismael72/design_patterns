package structural.adapter;

public class Main {
  public static void main(String[] args) {
    ExternalFahrenheitWeatherService fahrenheitWeatherService = new ExternalFahrenheitWeatherService();
    ExternalKelvinWeatherService kelvinWeatherService = new ExternalKelvinWeatherService();

    String cityA = "New York";
    String cityB = "Helsinki";

    WeatherService fahrenheitToCelsius = new FahrenheitToCelsiusAdapter(fahrenheitWeatherService);
    WeatherService kelvinToCelsius = new KelvinToCelsiusAdapter(kelvinWeatherService);

    double temperatureInCelsiusA = fahrenheitToCelsius.getTemperatureInCelsius(cityA);
    System.out.println(temperatureInCelsiusA + "°C");
    double temperatureInCelsiusB = kelvinToCelsius.getTemperatureInCelsius(cityB);
    System.out.println(temperatureInCelsiusB + "°C");
  }
}
