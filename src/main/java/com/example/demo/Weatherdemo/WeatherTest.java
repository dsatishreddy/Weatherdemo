package com.example.demo.Weatherdemo;

public class WeatherTest {
	
	    private double latitude;
	    private double longitude;
	    
		public WeatherTest(double longitude2, double latitude2) {
			this.latitude = latitude2;
			this.longitude = longitude2;
		}
		@Override
		public String toString() {
			return "WeatherTest [latitude=" + latitude + ", longitude=" + longitude + "]";
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
	   

}
