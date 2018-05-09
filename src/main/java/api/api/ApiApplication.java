package api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
@Controller
public class ApiApplication {

    @Autowired
	private CityMapper cityMapper;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String index(Model model) {
		City city = this.cityMapper.findByState("JP");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日'k'時'mm'分'ss'秒'");
        model.addAttribute("now", sdf.format(new Date()));
        model.addAttribute("city", city.toString());
        return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
