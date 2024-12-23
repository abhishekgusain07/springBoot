package gusain.abhishek.demo;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Car implements Vehicle {
	private Integer carId;
	private String carName;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(Integer carId, String carName) {
		super();
		this.carId = carId;
		this.carName = carName;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + "]";
	}
	@Override
	public void start() {
		System.out.println("car starting");
	}
	
}
