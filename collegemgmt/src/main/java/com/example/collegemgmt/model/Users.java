package com.example.collegemgmt.models;

public class Users {
	private int user_id;
	private String user_name;
	private String user_password;
	private String confirm_password;
	private String role;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String user_name, String user_password, String confirm_password, String role) {
		super();
		this.user_name = user_name;
		this.user_password = user_password;
		this.confirm_password = confirm_password;
		this.role = role;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
