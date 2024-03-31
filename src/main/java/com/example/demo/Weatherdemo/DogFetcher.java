/*
 * package com.example.demo.Weatherdemo;
 * 
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.boot.autoconfigure.web.reactive.function.client.
 * WebClientSsl; import org.springframework.http.HttpHeaders; import
 * org.springframework.http.MediaType;
 * 
 * 
 * public class DogFetcher {
 * 
 * 
 * private static void getRandomDogImage() { WebClientSsl webClient =
 * WebClient.create();
 * 
 * Mono<DogImage> dogImageMono = webClient.get() .uri(DOG_API_URL)
 * .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
 * .header("x-api-key", API_KEY) .retrieve() .bodyToMono(DogImage.class);
 * 
 * dogImageMono.subscribe(dogImage ->
 * System.out.println("Random Dog Image URL: " + dogImage.getMessage())); } }
 */