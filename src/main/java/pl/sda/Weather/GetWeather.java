package pl.sda.Weather;

import java.io.IOException;
import java.util.Scanner;


public class GetWeather {

    final static String API_KEY = "8f8920fad8ebff615f1885f7a9e03704";
    static String url = "http://api.weatherstack.com/current";

    public static void main(String[] args) throws IOException {
        WeatherService service = new WeatherService(url, API_KEY);   //odczyt z URL
        System.out.println("Podaj nazwę miasta:");
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        Weather weather = service.getCityWeather(city);
        System.out.println(
                "Temperatura wynosi: " + weather.getCurrent().getTemperature() + "\n" +
                "Prędkość wiatru: " + weather.getCurrent().getWind_speed() + " km/h\n" +
                "Ciśnienie wynosi: " + weather.getCurrent().getPressure() + " hPa"
        );
    }
}
