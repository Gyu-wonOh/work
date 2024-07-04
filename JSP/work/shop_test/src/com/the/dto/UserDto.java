package com.the.dto;

import java.time.LocalDateTime;

public class UserDto {
	
	private String id = null;
	private int pw = 0;
	private int pwCheck = 0;
	private String name = null;
	private String gender = null;
	private String birthday = null;
	private String email = null;
	private String phoneNumber = null;
	private String address = null;
	
	public UserDto() {}
	public UserDto(String id, int pw, int pwCheck, String name, String gender, String birthday, String email,
			String phoneNumber, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.pwCheck = pwCheck;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public int getPwCheck() {
		return pwCheck;
	}
	public void setPwCheck(int pwCheck) {
		this.pwCheck = pwCheck;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
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
		return "UserDto [id=" + id + ", pw=" + pw + ", pwCheck=" + pwCheck + ", name=" + name + ", gender=" + gender
				+ ", birthday=" + birthday + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
	
	

}
