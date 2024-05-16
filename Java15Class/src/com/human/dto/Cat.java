package com.human.dto;

import java.util.Objects;

public class Cat {
	//클래스 필드
//	public static int count =0;
	//인스턴스 필드
	public String name = "나비";
	public int age = 3;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}
