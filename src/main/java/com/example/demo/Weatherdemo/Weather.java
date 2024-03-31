package com.example.demo.Weatherdemo;

public class Weather {
    private String cityName;
    private double temperature;
    private String description;
    private double speed;
    private double visibility;

    public Weather(String cityName, double temperature, String description, double speed, double visibility) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.description = description;
        this.speed = speed;
        this.visibility = visibility;
    }

    public double getVisibility() {
		return visibility;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	// Getters and setters (or just getters if you don't need to modify these fields)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
