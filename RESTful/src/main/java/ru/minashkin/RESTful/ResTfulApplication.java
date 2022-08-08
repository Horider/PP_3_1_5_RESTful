package ru.minashkin.RESTful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResTfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://94.198.50.185:7081/api/users";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		System.out.println(response);
	}

}
