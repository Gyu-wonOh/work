package com.sns.dto;

public class UserDto {
	private String email;
	private String phoneNumber;
	private String name;
	private String nickname;
	private String password;
	private String u_delete;
	
	public String getU_delete() {
		return u_delete;
	}
	public void setU_delete(String u_delete) {
		this.u_delete = u_delete;
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
				+ ", password=" + password + ", u_delete=" + u_delete + "]";
	}
}
