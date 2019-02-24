package com.lsm.spring4.spring4_chap02;

public class User {

	private String id;
	private String password;
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean matchPassword(String inputPassward) {
		return password.equals(inputPassward);
	}
	
	public void changePassword(String oldPassowrd,String newPassword) {
		if(!matchPassword(oldPassowrd))
			throw new IllegalArgumentException("illegal password");
		password = newPassword;
	}
}
