package com.ecommerce.beans;

public class User {

	private Integer userId;
	private String userName;
	private String email;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userId, String userName, String email, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
