package pl.sda.Weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class GetWeather {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String url = "http://api.weatherstack.com/current" +
                "?access_key=8f8920fad8ebff615f1885f7a9e03704&query=Zbiersk";
        Weather object = mapper.readValue(new URL(url), Weather.class);
        System.out.println(object.getCurrent());
    }
}
