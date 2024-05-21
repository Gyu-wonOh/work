package com.the.ex;
class Car{
	
	public static void printCarName() {
		System.out.println("그랜저");
		System.out.println("소나타");
		return;
	}
	public static void printCarName(String owner) {
		System.out.println("소유자:"+owner);
		System.out.println("그랜저");
		System.out.println("소나타");
	}
	//매개변수로 객체배열, 리턴값으로 객체
	//강아지 이름과 강아지 배열을 입력받아 해당 강아지를 찾아주는 메소드
	public static Dog dogUseCar(String name,Dog[]d) {
		Dog findDog = null;
		for(int i =0; i < d.length; i++) {
			if(name.equals(d[i].name)) {
				findDog = d[i];
				break;
			}
		}
		return findDog;
	}

}
class Dog{
	public String name = "";
}
public class MyClass2 {

	public static void main(String[] args) {
		//아는 차이름 출력하는 메소드
		Car.printCarName();
		Car.printCarName();
		Car.printCarName();
		Car.printCarName("홍길동");
		for(int i =0; i<3 ; i++) {
			Car.printCarName("홍"+i);
		}
//		public static Dog dogUseCar(Dog[]d) {
		Dog[]d = new Dog[10];
		for(int i = 0; i<d.length; i++) {
			d[i] = new Dog();
			d[i] .name ="홍"+i;
		}
		Car.dogUseCar("홍3",d);
	Dog findDog =Car.dogUseCar("홍3", d);
	System.out.println(findDog.name);
	}

}
