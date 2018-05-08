package api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {

    @Autowired
	private CityMapper cityMapper;

	@RequestMapping("/")
	String index() {
		City ub = this.cityMapper.findByState("JP");
        return "はじめまして！" + ub.toString() + "です";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
