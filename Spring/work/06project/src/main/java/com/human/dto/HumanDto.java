package com.human.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class HumanDto {
	private String name;
	private String nickName;
	private String password;
	private String gender;
	private String[] hobby;
	private String age;
	private String birthday;
	private String email;
	private String file;
	private String introduction;
	private String joinScope;
	
	public HumanDto() {
	}

	public HumanDto(String name, String nickName, String password, String gender, String[] hobby, String age,
			String birthday, String email, String file, String introduction, String joinScope) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.password = password;
		this.gender = gender;
		this.hobby = hobby;
		this.age = age;
		this.birthday = birthday;
		this.email = email;
		this.file = file;
		this.introduction = introduction;
		this.joinScope = joinScope;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getJoinScope() {
		return joinScope;
	}

	public void setJoinScope(String joinScope) {
		this.joinScope = joinScope;
	}

	@Override
	public String toString() {
		return "HumanDto [name=" + name + ", nickName=" + nickName + ", password=" + password + ", gender=" + gender
				+ ", hobby=" + Arrays.toString(hobby) + ", age=" + age + ", birthday=" + birthday + ", email=" + email
				+ ", file=" + file + ", introduction=" + introduction + ", joinScope=" + joinScope + "]";
	}

	
}
