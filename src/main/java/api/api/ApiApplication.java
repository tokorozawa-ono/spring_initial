package api.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {

	@RequestMapping("/")
	String hello() {
		return "はじめまして！";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
