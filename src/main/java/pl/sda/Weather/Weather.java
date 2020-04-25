package pl.sda.Weather;

public class Weather {

    private Double temperature;
    private String city;
    private AirPollution airPollution;
    private Request request;
    private Location location;

    public Weather() {}; // zrobione po to aby program nie wywalał InvalidDefinitionException.

    public Weather(Double temperature, String city, AirPollution airPollution, Request request, Location location) {
        this.temperature = temperature;
        this.city = city;
        this.airPollution = airPollution;
        this.request = request;
        this.location = location;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AirPollution getAirPollution() {
        return airPollution;
    }

    public void setAirPollution(AirPollution airPollution) {
        this.airPollution = airPollution;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}