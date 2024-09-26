package com.human.dto;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class HumanDto {
	private Integer id;
	private int age;
	private String name;
	private double height;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "HumanDto [id=" + id + ", age=" + age + ", name=" + name + ", height=" + height + ", birthday="
				+ birthday + "]";
	}
	
	
}
