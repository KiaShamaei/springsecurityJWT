package com.springsecurity.jwtexample.model;





public class User {
	
	
	private String user ;
	private String token;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public User(String user, String token) {
		super();
		this.user = user;
		this.token = token;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
