package com.example.demo.Weatherdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Main main;
    private WeatherInfo[] weather;
    private String name;
    private Wind wind;
    private double visibility;

    public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	// Getters and setters
    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public WeatherInfo[] getWeather() {
        return weather;
    }

    public void setWeather(WeatherInfo[] weather) {
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public double getVisibility() {
		// TODO Auto-generated method stub
		return visibility;
	}

	
	
	
}
