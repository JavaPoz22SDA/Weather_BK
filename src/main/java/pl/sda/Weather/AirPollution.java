package pl.sda.Weather;

public class AirPollution {
    private Double pollution;
    private String airCondition;

    public AirPollution() {}; // exception

    public AirPollution(Double pollution, String airCondition) {
        this.pollution = pollution;
        this.airCondition = airCondition;
    }

    public Double getPollution() {
        return pollution;
    }

    public String getAirCondition() {
        return airCondition;
    }

    public void setPollution(Double pollution) {
        this.pollution = pollution;
    }

    public void setAirCondition(String airCondition) {
        this.airCondition = airCondition;
    }
}
