package com.the.ex;

class Student {
	public static int ageLimit = 30;
	public static int totalStudentCount = 0;

	public String name = "";
	public int age = 0;
	public int grade = 1;

	public Student() {
		Student.totalStudentCount++;
	}

	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public static void ageLimitInfo() {
		System.out.println("학생 연령 제한 나이는 " + Student.ageLimit);
	}

	public void myAgeLimitInfo() {
		if (this.age > Student.ageLimit) {
			System.out.println("연령제한을 초과하였습니다.");
		} else {
			System.out.println("고등 학생으로 가능한 나이");
		}
	}

	public void studentInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("나이 :" + this.age);
		System.out.println("학년 :" + this.grade);

	}

	public void myGradeInfo() {
		System.out.println(this.name + "님의 학년은" + this.grade + "입니다.");
	}

	public static void studentGradeInfo(Student s) {
		System.out.println(s.name + "님의 학년은" + s.grade + "입니다.");
	}
}

public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.ageLimitInfo();
		System.out.println(Student.totalStudentCount);

		Student st1 = new Student("홍1", 23, 3);
		Student st2 = new Student("홍2", 13, 2);
		Student st3 = new Student("홍3", 43, 1);

		// 홍3의 연령제한 확인정보
		st3.myAgeLimitInfo();
		// 홍1의 학생정보를 출력
		st1.studentInfo();
		// 홍3의 학생정보를 출력
		st2.studentInfo();
		// 학년 메시지 2가지로
		// 학생 객체를 받아서 학생의 학년 출력
		// 본인의 학년 출력

		// 학생의 학녁 확인
		st1.myGradeInfo();
		st2.myGradeInfo();
		Student.studentGradeInfo(st1);
		Student.studentGradeInfo(st2);
	}

}
