package gusain.abhishek.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike Starting");
	}
	
}
