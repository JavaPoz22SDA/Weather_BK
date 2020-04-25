package pl.sda.Weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        AirPollution airPollution = new AirPollution(80.0, "bad");
        Request request = new Request("City", "Poznan, Poland");
        Location location = new Location("Poznan", "Poland");
        Weather weather = new Weather(23.5, "Poznań", airPollution, request, location);
        weather.setTemperature(28.1);

        mapper.writeValue(new File("data.json"), weather); //zapis do json

        Weather readWeather = mapper.readValue(new File("data.json"), Weather.class); // odczyt z pliku (domyśly konstruktor w każdej klasie)
        System.out.println(readWeather.getRequest().getQuery());
        System.out.println(readWeather.getTemperature());
        System.out.println(readWeather.getAirPollution().getAirCondition());
    }
}
