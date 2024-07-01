package com.the.dto;

import java.time.LocalDateTime;

public class HumanDto {
	private String name;
	private Integer age;
	private Double height;
	private LocalDateTime birthday;
	
	public HumanDto() {}
	
	public HumanDto(String name, Integer age, Double height, LocalDateTime birthday) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.birthday = birthday;
	}
	
	public HumanDto(String string, int i, int j, LocalDateTime now) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "humanDto [name=" + name + ", age=" + age + ", height=" + height + ", birthday=" + birthday + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	
}
