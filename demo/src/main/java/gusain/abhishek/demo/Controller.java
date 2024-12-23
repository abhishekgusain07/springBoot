package gusain.abhishek.demo;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Car car;
	
	@GetMapping("/")
	public String greetings() {
		return "Hello from springBoot backend";
	}
	
	@GetMapping("/json")
	public Car get() {
		car.setCarId(12);
		car.setCarName("Bmw M3");
		
		return car;
	}
	
	@GetMapping("/json2")
	public ResponseEntity<Car> getCar() {
		car.setCarId(112);
		car.setCarName("Bmw M5 Comp");
		
		return new ResponseEntity<>(car,HttpStatus.OK);
	}
}
