package com.sns.dto;

public class UserDto {
	private String email;
	private String phoneNumber;
	private String name;
	private String nickname;
	private String password;
	private String delete;
	public String getDelete() {
		return delete;
	}
	public void setDelete(String delete) {
		this.delete = delete;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDto [email=" + email + ", phoneNumber=" + phoneNumber + ", name=" + name + ", nickname=" + nickname
				+ ", password=" + password + ", delete=" + delete + "]";
	}
}
