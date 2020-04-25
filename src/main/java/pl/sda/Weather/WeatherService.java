package pl.sda.Weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class WeatherService {

    private String finalURL;
    private Weather weather;
    ObjectMapper mapper = new ObjectMapper();

    public WeatherService(String url, String key) {
        finalURL = url + "?access_key=" + key;
    };

    public Weather getCityWeather(String cityName) throws IOException {
        finalURL = finalURL + "&query=" + cityName;
        return mapper.readValue(new URL(finalURL), Weather.class);
    }
}
