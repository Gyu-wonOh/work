package com.human.dto;
import java.util.Objects;
public class BankUser {
	
	public String id = "non";
	public String pw = "non";
	public double account = 0;
	public BankUser() {
	}

	public BankUser(String id,String pw, int account) {
		this. id = id;
		this. pw = pw;
		this.account =account;
	}
	
	public BankUser(String id) {
		this(id,"1234",0);
	}

	public BankUser(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	//Getter methods
	public String getId(){
		return id;
	}
	public String getPw() {
		return pw;
	}
	public double getAccount() {
		return account;
	}
	//Setter methods
	public void setId(String id) {
		this.id =id;
	}
	public void setPw(String pw) {
		this.pw =pw;
	}
	public void setAccount(double  account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "BankUser [id=" + id + ", pw=" + pw + ", account=" + account + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, id, pw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankUser other = (BankUser) obj;
		return account == other.account && Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	
}
