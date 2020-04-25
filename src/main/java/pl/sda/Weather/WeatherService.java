package pl.sda.Weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class WeatherService {
    private String url;
    private String key;
    private String finalURL;

    public WeatherService(String url, String key) {
        this.url = url;
        this.key = key;

        finalURL = url + key;
    };

    public Current getWeatherService(String cityName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Weather object = mapper.readValue(new URL(finalURL+cityName), Weather.class);
        return object.getCurrent();
    }
}
