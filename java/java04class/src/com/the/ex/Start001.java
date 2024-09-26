package com.the.ex;
import com.the.dto.Car;
public class Start001 {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "빨강";
		car.company = "현대";
		car.maxSpeed = 200;
		car.model ="소나타";
		car.tire.company = "금호타이어";
		car.tire.mileage=20;
		car.tire.price=50000;
		
		Car newCar = new Car();
		//newCar=car; 위의 인스턴스 car 메모리를 할당하게 되어 위의 값이 변경될 수 있다.
		newCar.color = car.color;
		newCar.company = car.company;
		newCar.maxSpeed = car.maxSpeed;
		newCar.model = car.model;
		//newCar.tire = car.tire;
		newCar.tire.company = car.tire.company;
		newCar.tire.mileage = car.tire.mileage;
		newCar.tire.price = car.tire.price;
		System.out.println(car.color);
		System.out.println(car.tire.company);
		System.out.println(newCar.color);
		System.out.println(newCar.tire.company);
	}

}
