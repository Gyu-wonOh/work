package com.the.dto;

import java.time.LocalDateTime;

public class HumanDto {
	public String name;
	public int age;
	public double height;
	public LocalDateTime birthday;
	
	public HumanDto() {}
	
	
	
	public HumanDto(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}



	public HumanDto(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}



	public HumanDto(String name, int age, double height, LocalDateTime birthday) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "HumanDto [name=" + name + ", age=" + age + ", height=" + height + ", birthday=" + birthday + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

}
