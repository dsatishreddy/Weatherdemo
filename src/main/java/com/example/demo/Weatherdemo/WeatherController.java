package com.example.demo.Weatherdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherFetcher weatherService;

    @GetMapping("/weather")
    public Weather getWeather(@RequestParam String city1,@RequestParam String city2) {
        return weatherService.getWeather(city1,city2);
    }
    
    @GetMapping("/weather123")
    public void getlatlon(@RequestParam String lat,@RequestParam String lon) {
    	weatherService.getLatLon(lat,lon);
    }
    
    @GetMapping("/test")
    public void getTest() {
    	weatherService.getTest();
    }
}
