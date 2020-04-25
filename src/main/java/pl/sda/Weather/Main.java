package pl.sda.Weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Request request = new Request("City", "Poznan, Poland", "pl", "m");
        Location location = new Location("Poznan", "Poland", "Wlkp", "", "", "Europe/Warsaw", "2020-04-25 00:00", 1587808500, "2.0");
        Current current = new Current("12:00 AM", 9, 116, new String[]{"https://assets.weatherstack.com/images/wsymbols01_png_64/wsymbol_0002_sunny_intervals.png"}, new String[]{"Partly cloudy"}, 19, 310, "NW", 1002, 0, 66, 75, 6, 3, 10, "yes");
        Weather weather = new Weather(23.5, "Poznań", request, location, current);
        weather.setTemperature(28.1);

        mapper.writeValue(new File("data.json"), weather); //zapis do json

        Weather readWeather = mapper.readValue(new File("data.json"), Weather.class); // odczyt z pliku (domyśly konstruktor w każdej klasie)
        System.out.println(readWeather.getRequest().getQuery());
        System.out.println(readWeather.getTemperature());

        WeatherService service = new WeatherService( "http://api.weatherstack.com/current","8f8920fad8ebff615f1885f7a9e03704");//odczyt z URL
        System.out.println(service.getWeatherService("Poznan")); // odczyt z URL dla miasta Poznan
    }
}
