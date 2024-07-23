package com.human.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class UserDto {
	String id;
	String name;
	String gender;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	LocalDateTime birthday;
	String email;
	String phoneNumber;
	String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	public UserDto() {}
	public UserDto(String id, String name, String gender, LocalDateTime birthday, String email, String phoneNumber,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
}
