
import com.human.dto.Human;
public class MyGetterSetter {

	public static void main(String[] args) {
		//Getter, Setter 객체지향언어 캡슐화

//		Human h1 =new Human("홍1",10);
//		h1.age = 11;
//		h1.name= 홍길동;
		

		Human h1 =new Human();
		h1.setAge(40);
		h1.setName("홍길동");
		System.out.println(h1);
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
	}

}
