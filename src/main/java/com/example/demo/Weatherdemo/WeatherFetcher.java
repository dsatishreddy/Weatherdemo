package com.example.demo.Weatherdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherFetcher {

    @Value("${openweathermap.apiKey}")
    private String apiKey;

    @Value("${openweathermap.apiUrl}")
    private String apiUrl;
    
    @Value("${openweathermaplatlon.apiUrl}")
    private String apiUrlLatLon;

    private final RestTemplate restTemplate;

    public WeatherFetcher(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Weather getWeather(String city1,String city2) {
        String urlString1 = apiUrl + "q=" + city1 + "&appid=" + apiKey + "&units=metric"; // Metric units
        String urlString2 = apiUrl + "q=" + city2 + "&appid=" + apiKey + "&units=metric"; // Metric units
        
        WeatherResponse response1 = restTemplate.getForObject(urlString1, WeatherResponse.class);
        WeatherResponse response2 = restTemplate.getForObject(urlString2, WeatherResponse.class);
        
        
        double temperature1 = response1.getMain().getTemp();
        String cityName1 = response1.getName();
        String description1 = response1.getWeather()[0].getDescription();
        double windspeed1 = response1.getWind().getSpeed();
        double visibilitycity1 = response1.getVisibility();
        
        double temperature2 = response2.getMain().getTemp();
        String cityName2 = response2.getName();
        String description2 = response2.getWeather()[0].getDescription();
        double windspeed2 = response2.getWind().getSpeed();
        double visibilitycity2 = response2.getVisibility();
        
        
        
        System.out.println(" diff in temprature::"+(temperature2 -temperature1));
        System.out.println("description::"+description1);
        System.out.println("description::"+description2); // Extract weather data from response
        
        // Create Weather object with extracted data
        return new Weather(cityName1, temperature1, description1, windspeed1, visibilitycity1);
    }

	public WeatherTest getLatLon(String lat, String lon) {
		String urlString12 = apiUrlLatLon + "lat=" + lat +"&"+ "lon=" + lon + "&appid=" + apiKey + "&units=metric"; ; 
		 System.out.println("url string::"+urlString12);
		
		
		 WeatherLatLonResponse response12 = restTemplate.getForObject(urlString12, WeatherLatLonResponse.class);
		 
		 System.out.println("response::"+response12);
		 
		 double latitude = response12.getCity().getLat();
		 double longitude = response12.getCity().getLon();
		 
		 return new WeatherTest(longitude, latitude);
	}
	
	public void getTest() {
		
		 String urlString3 = "https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=7ucgSYkcTFEEtExTxsvNzyGSP7Y69tE0";


         
         HttpHeaders headers = new HttpHeaders();
         headers.setContentType(MediaType.APPLICATION_JSON);
         HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

         ResponseEntity<Map> response = restTemplate.exchange(
                 urlString3,
                 HttpMethod.GET,
                 requestEntity,
                 Map.class // Replace with the actual response type if you know it
         );

         if (response.getStatusCode() == HttpStatus.OK) {
             response.getBody();
             System.out.println("response is::"+response.getBody());
         } else {
             // Handle unsuccessful response (e.g., throw an exception or log an error)
             throw new RuntimeException("API call failed with status code: " + response.getStatusCodeValue());
         }
     }

	
	
	
    
    
  
}
