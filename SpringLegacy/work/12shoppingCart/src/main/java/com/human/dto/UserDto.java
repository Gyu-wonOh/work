package com.human.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class UserDto {
	private String id;
	private String pw;
	private String name;
	private String gender;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private LocalDateTime birthday;
	private String email;
	private String phoneNumber;
	private String address;
	
	public UserDto() {}
	
	public UserDto(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public UserDto(String id, String pw, String name, String gender, LocalDateTime birthday, String email,
			String phoneNumber, String address) {
		super();
		this.id = id;
		this.pw = pw;
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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
		return "UserDto [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}
